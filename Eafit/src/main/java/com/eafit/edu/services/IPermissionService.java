package com.eafit.edu.services;

import java.util.List;

import com.eafit.edu.models.Permission;

public interface IPermissionService {

	List<Permission> GetPermissions();

	Permission CreatePermission(Permission permission);

	boolean DeletePermission(String permissionName);

}
