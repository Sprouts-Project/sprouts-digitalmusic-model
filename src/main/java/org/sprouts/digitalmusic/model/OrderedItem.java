package org.sprouts.digitalmusic.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="ordereditem")
public class OrderedItem extends DomainEntity {
	
	// Attributes -------------------------------------------------------------

	private double price;
	private int quantity;

	// Constructors -----------------------------------------------------------
	
	public OrderedItem() {

	}

	// Getters/Setters --------------------------------------------------------
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Min(0)
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// Relationships ----------------------------------------------------------
	
	private Order order;
	private Item item;

	@ManyToOne
	@JoinColumn(name="item_id")
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	@ManyToOne
	@JoinColumn(name="order_id")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
