package com.eafit.edu.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.services.IUserRolesService;


@RestController
@RequestMapping("/userroles")
public class UserRolesController {

	@Autowired
	private IUserRolesService UserRolesService;
	
	@PostMapping(path = "/api/AddUserRole")
	public boolean AddUserRole(String userName, String roleName)
	{
		return UserRolesService.AddUserRole(userName, roleName);
	}
	
	@DeleteMapping(path = "/api/DeleteUserRole")
	public boolean DeleteUserRole(String userName, String roleName)
	{
		return UserRolesService.DeleteUserRole(userName, roleName);
	}
}
