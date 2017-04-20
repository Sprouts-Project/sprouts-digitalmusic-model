package org.sprouts.digitalmusic.model.parser.stock;

public class SotckMonthlySalesByState {

	//Attributes
	private String month;
	private String year;
	private double numProducts;
	private String state;
	private String abbreviation;
	
	//Constructor
	public SotckMonthlySalesByState(){
		
	}
	
	//Getters and setters
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getNumProducts() {
		return numProducts;
	}

	public void setNumProducts(double numProducts) {
		this.numProducts = numProducts;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
