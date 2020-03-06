package ee.dmipet90.helmes.homework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ee.dmipet90.helmes.homework.entity.User;
import ee.dmipet90.helmes.homework.repository.UserRepository;
import ee.dmipet90.helmes.homework.service.UserService;
import ee.dmipet90.helmes.homework.shared.Constants;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserById(long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException(Constants.INVALID_USER_ID + id));
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	
}
