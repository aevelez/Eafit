package com.eafit.edu.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private String Name ;
	
	@Column(length=50)
	private String Password;
	
	@Column(length=100)
	private String FullName;
	
	@Column(length=50)
	private String FullBusinessTitle;// (Company name, Position)
	
	@Column(length=100)
	private String EMailAddress;
	
	@Column(length=50)
	private String Phone; //(optional)
	
	@Column(length=100)
	private String Working_Address; //(optional)
	
	@Column()
	private boolean Inactive ;
	
	@Column()
	private Date  RegistrationDate;
	
	@Column()
	private Date  LastLoginDate;
	
	@OneToMany(targetEntity=Role.class,mappedBy = "UserRole",fetch=FetchType.EAGER)
	private List<Role> Roles;
	
	
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
	
	public Date getLastLoginDate() {
		return LastLoginDate;
	}
	
	public void setLastLoginDate(Date lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}
	
	public Date getRegistrationDate() {
		return RegistrationDate;
	}
	
	public void setRegistrationDate(Date registrationDate) {
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
		
	public List<Role> getRoles() {
		return Roles;
	}
	
	public void setRoles(List<Role> roles) {
		Roles = roles;
	}
}