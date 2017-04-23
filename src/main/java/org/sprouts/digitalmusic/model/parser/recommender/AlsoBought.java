package org.sprouts.digitalmusic.model.parser.recommender;

public class AlsoBought {

	private int item_id;
	private String title;
	private String brand;
	private String imUrl;
	private int quantity;

	//Constructor
	public AlsoBought(){
		super();
	}

	//Getter and setters
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImUrl() {
		return imUrl;
	}

	public void setImUrl(String imUrl) {
		this.imUrl = imUrl;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
