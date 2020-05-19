package com.eafit.edu.services;

public interface IRolePermissionsService {

	boolean AddRolePermission(String roleName, String permissionName);
	boolean DeleteRolePermission(String roleName, String permissionName);

}
