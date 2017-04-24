package org.sprouts.digitalmusic.model.parser.stock;

import java.util.List;

public class MonthlySalesPredictionsByState {
	//Attributes
	private int month;
	private int year;
	private List<StateSale> statesSales;
	
	// Constructor
	public MonthlySalesPredictionsByState(){
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
	
	public List<StateSale> getStatesSales() {
		return statesSales;
	}

	public void setStatesSales(List<StateSale> statesSales) {
		this.statesSales = statesSales;
	}
		
}
