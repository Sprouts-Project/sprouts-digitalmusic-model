package org.sprouts.digitalmusic.model;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="item")
public class Item extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String title;
	private String description;
	private String brand;
	private double price;
	private String imUrl;

	// Constructors -----------------------------------------------------------
	
	public Item() {

	}

	// Getters/Setters --------------------------------------------------------
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(columnDefinition = "TEXT")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Min(0)
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@URL
	public String getImUrl() {
		return imUrl;
	}

	public void setImUrl(String imUrl) {
		this.imUrl = imUrl;
	}

	// Relationships ----------------------------------------------------------
	
	private Collection<Category> categories;

	@ManyToMany
	@JoinTable(name = "item_category", joinColumns = @JoinColumn(name = "items_id"), inverseJoinColumns = @JoinColumn(name = "categories_id"))
	public Collection<Category> getCategories() {
		return categories;
	}

	public void setCategories(Collection<Category> categories) {
		this.categories = categories;
	}
}
