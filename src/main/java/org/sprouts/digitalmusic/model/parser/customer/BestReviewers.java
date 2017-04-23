package org.sprouts.digitalmusic.model.parser.customer;

public class BestReviewers {

	private String name;
	private int customerId;
	private int usefullness;
	private int numberOfReviews;

	//Constructor
	public BestReviewers(){
		super();
	}
	
	//Getter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getUsefullness() {
		return usefullness;
	}

	public void setUsefullness(int usefullness) {
		this.usefullness = usefullness;
	}

	public int getNumberOfReviews() {
		return numberOfReviews;
	}

	public void setNumberOfReviews(int numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}
	
}
