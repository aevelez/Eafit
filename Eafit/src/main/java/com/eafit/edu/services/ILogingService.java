package com.eafit.edu.services;

public interface ILogingService {

	boolean Log(String userName, String password);

	boolean ChangePassword(String userName, String newPassword);

}
