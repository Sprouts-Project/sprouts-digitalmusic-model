package org.sprouts.digitalmusic.model.parser.stock;

public class StockMonthlySale {

	//Attributes
	private int month;
	private int year;
	private double numProducts;
	
	// Constructor
	public StockMonthlySale(){
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

	public double getNumProducts() {
		return numProducts;
	}

	public void setNumProducts(double numProducts) {
		this.numProducts = numProducts;
	}
		
}
