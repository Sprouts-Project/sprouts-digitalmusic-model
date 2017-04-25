package org.sprouts.digitalmusic.model.parser.recommender;

public class CollaborativeFilteringJobServerResponse {
	private int user;
	private int product;
	private double rating;

	public CollaborativeFilteringJobServerResponse() {

	}

	public CollaborativeFilteringJobServerResponse(int user, int product, double rating) {
		super();
		this.user = user;
		this.product = product;
		this.rating = rating;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
