package com.eafit.edu.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Role {

	@Id
	private String Name ;
	
	@OneToMany(targetEntity=Permmision.class,mappedBy="RolePermmision",fetch=FetchType.EAGER)
	private List<Permmision> Permmisions;

	@ManyToOne(fetch=FetchType.LAZY)
	 @JoinColumn(name="User_Name")
	private User UserRole;
	
	public List<Permmision> getPermmisions() {
		return Permmisions;
	}

	public void setPermmisions(List<Permmision> permmisions) {
		Permmisions = permmisions;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
