package com.eafit.edu.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Permmision {

	@Id
	private String Name ;

	@ManyToOne(fetch=FetchType.LAZY)
	 @JoinColumn(name="RolePermmision_Name")
	private Role RolePermmision;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
