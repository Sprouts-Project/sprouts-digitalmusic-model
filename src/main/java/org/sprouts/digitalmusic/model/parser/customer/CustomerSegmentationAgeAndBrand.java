package org.sprouts.digitalmusic.model.parser.customer;

import java.util.List;


public class CustomerSegmentationAgeAndBrand {

	//Attributes
	private int profile_id;
	private int number_customers;
	private String  age_interval;
	
	private List<String> brands;

	// Constructor
	public CustomerSegmentationAgeAndBrand(){
		super();
	}

	//Getters and setters
	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}

	public int getNumber_customers() {
		return number_customers;
	}

	public void setNumber_customers(int number_customers) {
		this.number_customers = number_customers;
	}

	public String getAge_interval() {
		return age_interval;
	}

	public void setAge_interval(String age_interval) {
		this.age_interval = age_interval;
	}

	public List<String> getBrands() {
		return brands;
	}

	public void setBrands(List<String> brands) {
		this.brands = brands;
	}
	
}
