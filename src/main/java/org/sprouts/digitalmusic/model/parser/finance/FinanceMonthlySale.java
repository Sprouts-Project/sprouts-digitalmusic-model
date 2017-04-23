package org.sprouts.digitalmusic.model.parser.finance;

public class FinanceMonthlySale {

	//Attributes
	private int month;
	private int year;
	private double value;
	
	// Constructor
	public FinanceMonthlySale(){
		super();
	}

	//Getters and setters
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
		
}
