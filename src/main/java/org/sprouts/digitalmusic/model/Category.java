package org.sprouts.digitalmusic.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table
public class Category extends DomainEntity {

	// Attributes -------------------------------------------------------------
	
	private String name;

	// Constructors -----------------------------------------------------------
	
	public Category() {

	}
	
	// Getters/Setters --------------------------------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Relationships ----------------------------------------------------------
	
}
