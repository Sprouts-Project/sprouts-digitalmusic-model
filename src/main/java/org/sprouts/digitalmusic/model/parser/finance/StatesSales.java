package org.sprouts.digitalmusic.model.parser.finance;

public class StatesSales {

	//Attributes
	private double sales;
	private String state;
	private String abbreviation;
	
	//Constructor
	public StatesSales(){
		
	}
	
	//Getters and setters
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

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
	
	
}
