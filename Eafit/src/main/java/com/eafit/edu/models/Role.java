package com.eafit.edu.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	private String Name;
	@Column()
	private boolean Admon ;
	
	@ManyToMany(targetEntity=Permission.class,mappedBy="RolePermmisions",fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Permission> Permmisions = new HashSet<Permission>();

	@ManyToMany(targetEntity=UserEafit.class,fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<UserEafit> UserRole = new HashSet<UserEafit>();
	
	public Set<Permission> getPermmisions() {
		return Permmisions;
	}

	public void setPermmisions(Set<Permission> permmisions) {
		Permmisions = permmisions;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public boolean isAdmon() {
		return Admon;
	}

	public void setAdmon(boolean admon) {
		Admon = admon;
	}
}
