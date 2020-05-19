package com.eafit.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eafit.edu.models.UserEafit;
import com.eafit.edu.repositories.IUserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUserRepository UserRepository;
	
	@Override
	public List<UserEafit> GetUsers() {
				return UserRepository.findAll();
	}

	@Override
	public UserEafit CreateUser(UserEafit user) {
		Optional<UserEafit> userBD = UserRepository.findById(user.getName());
		
		if(!userBD.isPresent())
			return UserRepository.save(user);
		else 
			return null;
	}

	@Override
	public UserEafit UpdateUser(UserEafit user) {
		Optional<UserEafit> userBD = UserRepository.findById(user.getName());
		
		if(userBD.isPresent())
			return UserRepository.save(user);
		else 
			return null;
	}
}
