package com.eafit.edu.services;

import java.util.List;

import com.eafit.edu.models.Role;

public interface IRoleService {

	List<Role> GetRoles();

	Role CreateRole(Role role);

	boolean DeleteRole(String roleName);

}
