package com.eafit.edu.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	@Id
	private String Name;
	@Column()
	private boolean Admon ;
	
	@JoinTable(
		        name = "rel_roles_permissions",
		        joinColumns = @JoinColumn(name = "FK_Role", nullable = false),
		        inverseJoinColumns = @JoinColumn(name="FK_Permission", nullable = false)
		    )
	@ManyToMany(targetEntity=Permission.class, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Permission> Permmisions = new HashSet<Permission>();

	@ManyToMany(targetEntity=UserEafit.class,mappedBy = "Roles")
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
