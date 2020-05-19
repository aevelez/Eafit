package com.eafit.edu.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eafit.edu.models.Permission;
import com.eafit.edu.models.Role;
import com.eafit.edu.repositories.IPermissionRepository;
import com.eafit.edu.repositories.IRoleRepository;

@Service
public class RolePermissionsService implements IRolePermissionsService{

	@Autowired
	private IRoleRepository RoleRepository;
	
	@Autowired
	private IPermissionRepository PermissionRepository;

	@Override
	public boolean AddRolePermission(String roleName, String permissionName) {
		
		Optional<Role> roleBD = RoleRepository.findById(roleName);
		if(roleBD.isPresent())
		{
			Optional<Permission> permissionBD = PermissionRepository.findById(permissionName);
			if(permissionBD.isPresent())
			{
				Role role = roleBD.get();
				role.getPermmisions().add(permissionBD.get());
				RoleRepository.save(role);
				return true;
			}
			return false;
		}	
		return false;
	}
	
	@Override
	public boolean DeleteRolePermission(String roleName, String permissionName) {
		Optional<Role> roleBD = RoleRepository.findById(roleName);
		if(roleBD.isPresent())
		{
			Optional<Permission> permissionBD = PermissionRepository.findById(permissionName);
			if(permissionBD.isPresent())
			{
				Role role = roleBD.get();
				role.getPermmisions().remove(permissionBD.get());
				RoleRepository.save(role);
				return true;
			}
			return false;
		}	
		return false;
	}
}