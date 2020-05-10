package com.eafit.edu.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Permmision {

	@Id
	private String Name ;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
