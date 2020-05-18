package com.eafit.edu.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.services.IRolePermissionsService;

@RestController
@RequestMapping("/rolepermissions")
public class RolePermissionController {

	@Autowired
	private IRolePermissionsService RolePermissionService;
	
	@PostMapping(path = "/api/AddRolePermission")
	public boolean AddRolePermission(String roleName, String permissionName)
	{
		return RolePermissionService.AddRolePermission(roleName, permissionName);
	}
}
