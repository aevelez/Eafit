package com.eafit.edu.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class LogHistory {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column()
	private String Name;
	
	@Column()
	private Date LoginDate;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}

	public Date getLoginDate() {
		return LoginDate;
	}
	
	public void setLoginDate(Date loginDate) {
		LoginDate = loginDate;
	}
	
	
}
