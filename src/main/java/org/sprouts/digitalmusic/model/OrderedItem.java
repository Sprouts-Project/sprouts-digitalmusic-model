package org.sprouts.digitalmusic.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Access(AccessType.PROPERTY)
@Table
public class OrderedItem extends DomainEntity {
	// Attributes -------------------------------------------------------------

	private Double price;
	private Integer quantity;

	// Constructors -----------------------------------------------------------
	public OrderedItem() {

	}

	// Getters/Setters --------------------------------------------------------
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	// Relationships ----------------------------------------------------------
	private Order order;
	private Item item;

	@ManyToOne
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	@ManyToOne
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
