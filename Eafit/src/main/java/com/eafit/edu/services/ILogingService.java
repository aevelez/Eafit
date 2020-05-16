package com.eafit.edu.services;

import com.eafit.edu.models.UserEafit;

public interface ILogingService {

	UserEafit Log(String userName, String password);

	boolean ChangePassword(String userName, String newPassword);

}
