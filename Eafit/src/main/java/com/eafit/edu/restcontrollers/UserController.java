package com.eafit.edu.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.models.UserEafit;
import com.eafit.edu.services.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserService UserService;
		
	@GetMapping(path = "/api/GetUsers")
	public List<UserEafit> GetUsers(){
			
		return UserService.GetUsers();		
	}
	
	@PostMapping(path = "/api/CreateUser")
	public UserEafit CreateUser(@RequestBody UserEafit user)
	{
		return UserService.CreateUser(user);
	}
	
	@PutMapping(path = "/api/UpdateUser")
	public UserEafit UpdateUser(@RequestBody UserEafit user)
	{
		return UserService.UpdateUser(user);
	}
	
}