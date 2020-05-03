package com.eafit.edu.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@GetMapping
	public List<User> GetUsers(){
	
		User user= new User();
		user.setName("Alex");
		List<User> users= new ArrayList<>();
		users.add(user);
		return users;
		
	}
}