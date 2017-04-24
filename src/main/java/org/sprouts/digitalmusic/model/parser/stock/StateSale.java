package org.sprouts.digitalmusic.model.parser.stock;

public class StateSale {

	//Attributes
	private int sales;
	private String state;
	private String abbreviation;
	
	//Constructor
	public StateSale(){
		
	}
	
	//Getters and setters
	
	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
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
