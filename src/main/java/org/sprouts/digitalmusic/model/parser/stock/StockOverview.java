package org.sprouts.digitalmusic.model.parser.stock;

import java.util.List;

public class StockOverview {

	private List<StockMonthlySale> monthly_sales;
	private List<SotckListMonthlySalesByState> monthly_sales_by_state;
	private List<StockTopProduct> top_products;
	
	//Constructor
	public StockOverview(){
		super();
	}
	
	//Getter and setters
	public List<StockMonthlySale> getMonthly_sales() {
		return monthly_sales;
	}

	public void setMonthly_sales(List<StockMonthlySale> monthly_sales) {
		this.monthly_sales = monthly_sales;
	}

	public List<SotckListMonthlySalesByState> getMonthly_sales_by_state() {
		return monthly_sales_by_state;
	}

	public void setMonthly_sales_by_state(List<SotckListMonthlySalesByState> monthly_sales_by_state) {
		this.monthly_sales_by_state = monthly_sales_by_state;
	}

	public List<StockTopProduct> getTop_products() {
		return top_products;
	}

	public void setTop_products(List<StockTopProduct> top_products) {
		this.top_products = top_products;
	}

}
