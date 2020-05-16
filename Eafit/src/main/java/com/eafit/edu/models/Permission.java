package com.eafit.edu.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Permission {

	@Id
	private String Name ;

	@ManyToMany(targetEntity=Role.class,fetch=FetchType.EAGER)
	private List<Role> RolePermmisions;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
