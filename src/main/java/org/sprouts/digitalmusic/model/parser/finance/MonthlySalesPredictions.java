package org.sprouts.digitalmusic.model.parser.finance;

public class MonthlySalesPredictions {
	//Attributes
	private int month;
	private int year;
	private double salesValue;
	
	// Constructor
	public MonthlySalesPredictions(){
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

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}
		
}
