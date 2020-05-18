package com.eafit.edu.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Permission {

	@Id
	private String Name ;

	@ManyToMany(targetEntity=Role.class,mappedBy = "Permmisions")
	private Set<Role> RolePermmisions = new HashSet<Role>();
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
