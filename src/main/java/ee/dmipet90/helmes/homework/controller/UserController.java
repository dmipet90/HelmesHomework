package ee.dmipet90.helmes.homework.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ee.dmipet90.helmes.homework.entity.User;
import ee.dmipet90.helmes.homework.exception.SessionNotFoundException;
import ee.dmipet90.helmes.homework.service.SectorService;
import ee.dmipet90.helmes.homework.service.UserService;
import ee.dmipet90.helmes.homework.shared.Constants;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	SectorService sectorService;
	
	@GetMapping(Constants.HOME_URL)
	public String showAddUserForm(User user, Model model) {

		// Add sectors list to view
		model.addAttribute("sectors", sectorService.getAllSectors());

		return Constants.ADD_USER_FORM;
	}

	@PostMapping(Constants.ADD_USER_ACTION)
	public String addUser(@Valid User user, BindingResult result,  Model model, HttpSession session) {

		// Validate fields
		if (result.hasErrors()) {
			model.addAttribute("sectors", sectorService.getAllSectors());
			
			return Constants.ADD_USER_FORM;
		}

		// Save user details to database
		userService.saveUser(user);

		// Add created user id to session
		session.setAttribute("id", user.getId());
		
		// Add sectors list to view
		model.addAttribute("sectors", sectorService.getAllSectors());

		return Constants.REDIRECT_TO_UPDATE_USER;
	}

	@GetMapping(Constants.UPDATE_USER_URL)
	public String showUpdateForm(Model model, HttpSession session) {
		
		try {
			// Get user id from session
			long id = (long) session.getAttribute("id");

			// Get user details from database
			User user = userService.getUserById(id);

			// Pass user attributes to view
			model.addAttribute("user", user);
			
			// Add sectors list to view
			model.addAttribute("sectors", sectorService.getAllSectors());
			
		} catch (Exception e) {
			
			throw new SessionNotFoundException(e.getMessage());
		}

		return Constants.UPDATE_USER_FORM;
	}

	@PostMapping(Constants.UPDATE_USER_BY_ID_ACTION)
	public String updateUser(@Valid User user, BindingResult result, Model model, HttpSession session) {
		
		
		// Validate fields
		if (result.hasErrors()) {
			model.addAttribute("sectors", sectorService.getAllSectors());
			user.setId((long) session.getAttribute("id"));

			return Constants.UPDATE_USER_FORM;
		}
		
		user.setId((long) session.getAttribute("id"));
		
		// Save updated user details to database
		userService.saveUser(user);

		return Constants.REDIRECT_TO_UPDATE_USER;
	}
}
