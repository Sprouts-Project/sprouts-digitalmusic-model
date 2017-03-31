package org.sprouts.digitalmusic.model;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
@Table
public class ShoppingCart extends DomainEntity {

	// Attributes -------------------------------------------------------------

	// Constructors -----------------------------------------------------------
	
	public ShoppingCart() {

	}
	
	// Getters/Setters --------------------------------------------------------
	
	// Relationships ----------------------------------------------------------
	
	private Customer customer;
	private Collection<Item> items;

	@NotNull
	@Valid
	@OneToOne(cascade=CascadeType.ALL)
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@NotNull
	@Valid
	@ManyToMany
	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}
}
