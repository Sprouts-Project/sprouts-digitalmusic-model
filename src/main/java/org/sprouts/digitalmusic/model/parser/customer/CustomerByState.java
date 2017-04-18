package org.sprouts.digitalmusic.model.parser.customer;

public class CustomerByState {

	//Attributes
	private String name;
	private String abbreviation;
	private int totalCustomers;
	
	// Constructor
	public CustomerByState(){
		super();
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviaton) {
		this.abbreviation = abbreviaton;
	}

	public int getTotalCustomers() {
		return totalCustomers;
	}

	public void setTotalCustomers(int totalCustomers) {
		this.totalCustomers = totalCustomers;
	}
	
}
