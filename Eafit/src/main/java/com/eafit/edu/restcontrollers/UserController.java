package com.eafit.edu.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.models.UserEafit;
import com.eafit.edu.services.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserService UserService;
		
	@GetMapping
	public List<UserEafit> GetUsers(){
			
		return UserService.GetUsers();		
	}
	
	@PostMapping
	public UserEafit CreateUser(UserEafit user)
	{
		return UserService.CreateUser(user);
	}
	
}