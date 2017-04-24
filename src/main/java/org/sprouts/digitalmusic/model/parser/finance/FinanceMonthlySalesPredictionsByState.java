package org.sprouts.digitalmusic.model.parser.finance;

import java.util.List;

public class FinanceMonthlySalesPredictionsByState {

	//Attributes
	private String month;
	private String year;
	private List<StatesSales> statesSales;
	
	//Constructor
	public FinanceMonthlySalesPredictionsByState(){
		
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

	public List<StatesSales> getStatesSales() {
		return statesSales;
	}

	public void setStatesSales(List<StatesSales> statesSales) {
		this.statesSales = statesSales;
	}

}
