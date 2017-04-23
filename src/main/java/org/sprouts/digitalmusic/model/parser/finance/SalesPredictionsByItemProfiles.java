package org.sprouts.digitalmusic.model.parser.finance;

import java.util.List;

public class SalesPredictionsByItemProfiles {

	private String month;
	private String year;
	private List<ItemProfileSales> item_profile_sales;

	public SalesPredictionsByItemProfiles() {

	}

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

	public List<ItemProfileSales> getItem_profile_sales() {
		return item_profile_sales;
	}

	public void setItem_profile_sales(List<ItemProfileSales> item_profile_sales) {
		this.item_profile_sales = item_profile_sales;
	}

}
