package com.eafit.edu.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.models.Role;
import com.eafit.edu.services.IRoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

	
	@Autowired
	private IRoleService RoleService;
	
	@GetMapping(path = "/api/GetRoles")
	public List<Role> GetRoles(){
			
		return RoleService.GetRoles();		
	}
	
	@PostMapping(path = "/api/CreateRole")
	public Role CreateRole(@RequestBody Role role)
	{
		return RoleService.CreateRole(role);
	}
	
	@DeleteMapping(path = "/api/DeleteRole")
	public boolean DeleteRole(String roleName)
	{
		return RoleService.DeleteRole(roleName);
	}
}
