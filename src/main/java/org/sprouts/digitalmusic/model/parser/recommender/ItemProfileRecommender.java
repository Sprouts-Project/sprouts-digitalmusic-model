package org.sprouts.digitalmusic.model.parser.recommender;

import java.util.List;

public class ItemProfileRecommender {
	private int item_id;
	private List<String> categories;
	private List<ItemProfileRecommendation> items;

	public ItemProfileRecommender() {
		super();
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public List<ItemProfileRecommendation> getItems() {
		return items;
	}

	public void setItems(List<ItemProfileRecommendation> items) {
		this.items = items;
	}

}
