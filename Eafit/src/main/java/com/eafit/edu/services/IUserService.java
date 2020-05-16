package com.eafit.edu.services;

import java.util.List;

import com.eafit.edu.models.UserEafit;

public interface IUserService {

	List<UserEafit> GetUsers();

	UserEafit CreateUser(UserEafit user);

}

