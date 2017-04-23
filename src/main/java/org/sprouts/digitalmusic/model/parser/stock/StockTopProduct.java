package org.sprouts.digitalmusic.model.parser.stock;

public class StockTopProduct {

	//Attributes
	
	private String id;
	private String title;
	private int quantity;
	
	//Constructor
	
	public StockTopProduct(){
		super();
	}
	
	//Getters and setters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
