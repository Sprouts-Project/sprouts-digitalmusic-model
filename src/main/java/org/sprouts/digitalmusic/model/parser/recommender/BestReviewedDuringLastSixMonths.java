package org.sprouts.digitalmusic.model.parser.recommender;

public class BestReviewedDuringLastSixMonths {

	private int item_id;
	private String item_brand;
	private String item_description;
	private String item_imUrl;
	private double item_price;
	private String item_title;
	private double averageOverall;

	//Constructor
	public BestReviewedDuringLastSixMonths(){
		super();
	}
	
	//Getter and setters
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_brand() {
		return item_brand;
	}

	public void setItem_brand(String item_brand) {
		this.item_brand = item_brand;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public String getItem_imUrl() {
		return item_imUrl;
	}

	public void setItem_imUrl(String item_imUrl) {
		this.item_imUrl = item_imUrl;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}

	public String getItem_title() {
		return item_title;
	}

	public void setItem_title(String item_title) {
		this.item_title = item_title;
	}

	public double getAverageOverall() {
		return averageOverall;
	}

	public void setAverageOverall(double averageOverall) {
		this.averageOverall = averageOverall;
	}

	
}
