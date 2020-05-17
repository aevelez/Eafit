package com.eafit.edu.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eafit.edu.models.Role;
import com.eafit.edu.models.UserEafit;
import com.eafit.edu.repositories.IRoleRepository;
import com.eafit.edu.repositories.IUserRepository;

@Service
public class UserRolesService implements IUserRolesService{

	@Autowired
	private IUserRepository UserRepository;
	
	@Autowired
	private IRoleRepository RoleRepository;
	
	@Override
	public boolean AddUserRole(String userName, String roleName) {

		Optional<UserEafit> userBD = UserRepository.findById(userName);
		
		if(userBD.isPresent())
		{
			Optional<Role> roleBD = RoleRepository.findById(roleName);
			if(roleBD.isPresent())
			{
				UserEafit user = userBD.get();
				user.getRoles().add(roleBD.get());
				UserRepository.save(user);
				return true;
			}
			return false;
		}	
		return false;
		
		}
	}
