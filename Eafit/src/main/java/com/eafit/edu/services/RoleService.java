package com.eafit.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eafit.edu.models.Role;
import com.eafit.edu.repositories.IRoleRepository;

@Service
public class RoleService implements IRoleService{

	@Autowired
	private IRoleRepository RoleRepository;

	@Override
	public List<Role> GetRoles() {
		return RoleRepository.findAll();
	}

	@Override
	public Role CreateRole(Role role) {
		return RoleRepository.save(role);
	}

	@Override
	public boolean DeleteRole(String roleName) {
		if (RoleRepository.existsById(roleName))
		 { 
			RoleRepository.deleteById(roleName);
			return true;
		 }
		return false;
	}
}
