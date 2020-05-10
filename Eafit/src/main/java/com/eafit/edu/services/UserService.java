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
		return UserRepository.save(user);
	}

	@Override
	public boolean ChangePassword(String userName, String newPassword) {
		
		try {
			Optional<UserEafit> user = UserRepository.findById(userName);
			if(user == null)
				return false;
			
			user.get().setPassword(newPassword);
			UserRepository.save(user.get());
			
			return true;
		} catch (Exception e) {
		e.printStackTrace();
			return false;
		}
	}

}
