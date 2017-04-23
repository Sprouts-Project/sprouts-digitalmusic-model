package org.sprouts.digitalmusic.model.parser.finance;

public class FinanceMonthlySalesByState {

	//Attributes
	private String month;
	private String year;
	private double value;
	private String state;
	private String abbreviation;
	
	//Constructor
	public FinanceMonthlySalesByState(){
		
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

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
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
