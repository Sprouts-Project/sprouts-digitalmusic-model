package org.sprouts.digitalmusic.model.parser.finance;

import java.util.List;

public class FinanceOverview {

	private List<FinanceMonthlySale> monthly_sales;
	private List<FinanceMonthlySalesByState> monthly_sales_by_state;
	
	//Constructor
	public FinanceOverview(){
		super();
	}
	
	//Getter and setters
	public List<FinanceMonthlySale> getMonthly_sales() {
		return monthly_sales;
	}

	public void setMonthly_sales(List<FinanceMonthlySale> monthly_sales) {
		this.monthly_sales = monthly_sales;
	}

	public List<FinanceMonthlySalesByState> getMonthly_sales_by_state() {
		return monthly_sales_by_state;
	}

	public void setMonthly_sales_by_state(List<FinanceMonthlySalesByState> monthly_sales_by_state) {
		this.monthly_sales_by_state = monthly_sales_by_state;
	}

}
