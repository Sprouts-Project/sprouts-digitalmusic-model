package org.sprouts.digitalmusic.model.parser.customer;

public class CustomerAverageAgeByState {

	//Attributes
	private String name;
	private String abbreviaton;
	private double age;
	
	// Constructor
	public CustomerAverageAgeByState(){
		super();
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviaton() {
		return abbreviaton;
	}

	public void setAbbreviation(String abbreviaton) {
		this.abbreviaton = abbreviaton;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
	
}
