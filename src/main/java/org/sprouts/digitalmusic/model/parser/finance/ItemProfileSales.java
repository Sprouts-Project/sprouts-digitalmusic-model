package org.sprouts.digitalmusic.model.parser.finance;

import java.util.List;

public class ItemProfileSales {
	private int itemProfileId;
	private int sales;
	private List<String> categories;

	public ItemProfileSales() {

	}

	public int getItemProfileId() {
		return itemProfileId;
	}

	public void setItemProfileId(int itemProfileId) {
		this.itemProfileId = itemProfileId;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

}
