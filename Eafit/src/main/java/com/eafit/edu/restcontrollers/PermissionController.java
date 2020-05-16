package com.eafit.edu.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eafit.edu.models.Permission;
import com.eafit.edu.services.IPermissionService;

@RestController
@RequestMapping("/permissions")
public class PermissionController {

	@Autowired
	private IPermissionService PermissionService;
	
	@GetMapping(path = "/api/Permission/GetPermissions")
	public List<Permission> GetPermissions(){
			
		return PermissionService.GetPermissions();		
	}
	
	@PostMapping(path = "/api/Permission/CreatePermission")
	public Permission CreatePermission(@RequestBody Permission permission)
	{
		return PermissionService.CreatePermission(permission);
	}
	
	@DeleteMapping(path = "/api/Permission/DeletePermission")
	public boolean DeletePermission(String permissionName)
	{
		return PermissionService.DeletePermission(permissionName);
	}
	
}
