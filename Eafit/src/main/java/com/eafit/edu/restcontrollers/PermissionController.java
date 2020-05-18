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
	
	@GetMapping(path = "/api/GetPermissions")
	public List<Permission> GetPermissions(){
			
		return PermissionService.GetPermissions();		
	}
	
	@PostMapping(path = "/api/CreatePermission")
	public Permission CreatePermission(@RequestBody Permission permission)
	{
		return PermissionService.CreatePermission(permission);
	}
	
	@DeleteMapping(path = "/api/DeletePermission")
	public boolean DeletePermission(String permissionName)
	{
		return PermissionService.DeletePermission(permissionName);
	}
	
}
