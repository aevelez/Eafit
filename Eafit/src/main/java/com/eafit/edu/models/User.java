package com.eafit.edu.models;

import java.sql.Timestamp;

public class User {

	
	private String Name ;
	private String Password;
	private String FullName;
	private String FullBusinessTitle;// (Company name, Position)
	private String EMailAddress;
	private String Phone; //(optional)
	private String Working_Address; //(optional)
	private boolean Inactive ;
	private Timestamp  RegistrationDate;
	private Timestamp  LastLoginDate;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public boolean isInactive() {
		return Inactive;
	}
	public void setInactive(boolean inactive) {
		Inactive = inactive;
	}
	public Timestamp getLastLoginDate() {
		return LastLoginDate;
	}
	public void setLastLoginDate(Timestamp lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}
	public Timestamp getRegistrationDate() {
		return RegistrationDate;
	}
	public void setRegistrationDate(Timestamp registrationDate) {
		RegistrationDate = registrationDate;
	}
	public String getWorking_Address() {
		return Working_Address;
	}
	public void setWorking_Address(String working_Address) {
		Working_Address = working_Address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEMailAddress() {
		return EMailAddress;
	}
	public void setEMailAddress(String eMailAddress) {
		EMailAddress = eMailAddress;
	}
	public String getFullBusinessTitle() {
		return FullBusinessTitle;
	}
	public void setFullBusinessTitle(String fullBusinessTitle) {
		FullBusinessTitle = fullBusinessTitle;
	}
}