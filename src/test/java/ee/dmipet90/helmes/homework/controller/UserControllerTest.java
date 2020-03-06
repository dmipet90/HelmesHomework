package ee.dmipet90.helmes.homework.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class UserControllerTest {
	
	@Autowired
	 private WebApplicationContext wac;
	
	private MockMvc mockMvc;

	@BeforeEach
	void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	void testShowAddUserForm() throws Exception {
		  this.mockMvc.perform(get("/"))
		   .andExpect(status().isOk())
		   .andExpect(view().name("add-user"));
	}

	@Test
	void testAddUser() throws Exception {
		
		HashMap<String, Object> sessionattr = new HashMap<String, Object>();
		sessionattr.put("id", "123");
		  this.mockMvc.perform(post("/addUser"))
		   .andExpect(status().isOk());
	}

	@Test
	void testShowUpdateForm() throws Exception {
		  this.mockMvc.perform(get("/updateUser"))
		   .andExpect(status().is(404));
	}

	@Test
	void testUpdateUser() throws Exception {
		  this.mockMvc.perform(post("/updateUser/5"))
		   .andExpect(status().isOk());
	}

}
