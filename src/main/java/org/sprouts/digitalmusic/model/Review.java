package org.sprouts.digitalmusic.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
@Table
public class Review extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private Integer helpful;
	private String reviewText;
	private Integer unhelpful;

	private Date date;

	private String summary;
	private Double overall;

	// Constructors -----------------------------------------------------------
	public Review() {

	}

	// Getters/Setters --------------------------------------------------------
	@Min(0)
	public Integer getHelpful() {
		return helpful;
	}

	public void setHelpful(Integer helpful) {
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
	public Integer getUnhelpful() {
		return unhelpful;
	}

	public void setUnhelpful(Integer unhelpful) {
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
	public Double getOverall() {
		return overall;
	}

	public void setOverall(Double overall) {
		this.overall = overall;
	}

	// Relationships ----------------------------------------------------------
	private Customer customer;
	private Item item;

	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
