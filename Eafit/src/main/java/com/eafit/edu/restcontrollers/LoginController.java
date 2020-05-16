package com.eafit.edu.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.services.ILogingService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private ILogingService LoggingService;
	
	
	@GetMapping(path = "/api/Login")
	public boolean Log(String userName, String password)
	{
		return LoggingService.Log(userName, password);
	}
	
	@PutMapping(path = "/api/ChangePassword")
	public boolean ChangePassword(String userName, String newPassword)
	{
		return LoggingService.ChangePassword(userName, newPassword);
	}
	
}
