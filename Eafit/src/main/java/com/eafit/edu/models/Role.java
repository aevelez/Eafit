package com.eafit.edu.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	private String Name ;
	
	@ManyToMany(targetEntity=Permission.class,mappedBy="RolePermmisions",fetch=FetchType.EAGER)
	private List<Permission> Permmisions;

	@ManyToMany(targetEntity=UserEafit.class)
	private List<UserEafit> UserRole;
	
	public List<Permission> getPermmisions() {
		return Permmisions;
	}

	public void setPermmisions(List<Permission> permmisions) {
		Permmisions = permmisions;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
