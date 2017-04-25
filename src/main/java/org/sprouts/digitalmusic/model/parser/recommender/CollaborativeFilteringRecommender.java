package org.sprouts.digitalmusic.model.parser.recommender;

import java.util.List;

public class CollaborativeFilteringRecommender {
	private int customer_id;
	private List<ItemRecommendation> items;

	public CollaborativeFilteringRecommender() {
		super();
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public List<ItemRecommendation> getItems() {
		return items;
	}

	public void setItems(List<ItemRecommendation> items) {
		this.items = items;
	}

}
