package org.sprouts.digitalmusic.model.parser.stock;

import java.util.List;

public class SotckListMonthlySalesByState {

	//Attributes
	private String month;
	private String year;
	private List<SotckMonthlySalesByState> statesSales;
	
	//Constructor
	public SotckListMonthlySalesByState(){
		
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

	public List<SotckMonthlySalesByState> getStatesSales() {
		return statesSales;
	}

	public void setStatesSales(List<SotckMonthlySalesByState> statesSales) {
		this.statesSales = statesSales;
	}

}
