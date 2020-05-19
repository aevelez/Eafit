package com.eafit.edu.services;


public interface IUserRolesService {

	boolean AddUserRole(String userName, String roleName);
	boolean DeleteUserRole(String userName, String roleName);

}
