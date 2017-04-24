package org.sprouts.digitalmusic.model.parser.stock;

public class MonthlySalesPredictions {
	//Attributes
	private int month;
	private int year;
	private int sales;
	
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

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
		
}
