package org.sprouts.digitalmusic.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="review")
public class Review extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private int helpful;
	private String reviewText;
	private int unhelpful;
	private Date date;
	private String summary;
	private double overall;

	// Constructors -----------------------------------------------------------
	
	public Review() {

	}

	// Getters/Setters --------------------------------------------------------
	
	@Min(0)
	public int getHelpful() {
		return helpful;
	}

	public void setHelpful(int helpful) {
		this.helpful = helpful;
	}
	
	@Column(columnDefinition = "TEXT")
	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	@Min(0)
	public int getUnhelpful() {
		return unhelpful;
	}

	public void setUnhelpful(int unhelpful) {
		this.unhelpful = unhelpful;
	}

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Min(0)
	public double getOverall() {
		return overall;
	}

	public void setOverall(double overall) {
		this.overall = overall;
	}

	// Relationships ----------------------------------------------------------
	
	private Customer customer;
	private Item item;

	@ManyToOne
	@JoinColumn(name="customer_id")
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne
	@JoinColumn(name="item_id")
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
