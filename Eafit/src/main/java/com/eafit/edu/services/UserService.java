package com.eafit.edu.services;

import java.util.List;

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
		// TODO Auto-generated method stub
		return UserRepository.findAll();
	}

}
