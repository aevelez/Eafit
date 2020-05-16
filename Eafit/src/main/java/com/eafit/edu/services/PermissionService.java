package com.eafit.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eafit.edu.models.Permission;
import com.eafit.edu.repositories.IPermissionRepository;

@Service
public class PermissionService implements IPermissionService{

	@Autowired
	private IPermissionRepository PermissionRepository;

	@Override
	public List<Permission> GetPermissions() {
	
		return PermissionRepository.findAll();
	}

	@Override
	public Permission CreatePermission(Permission permission) {
		
		return PermissionRepository.save(permission);
	}

	@Override
	public boolean DeletePermission(String permissionName) {
		
		if (PermissionRepository.existsById(permissionName))
		 { 
			PermissionRepository.deleteById(permissionName);
			return true;
		 }
		return false;
	}
}
