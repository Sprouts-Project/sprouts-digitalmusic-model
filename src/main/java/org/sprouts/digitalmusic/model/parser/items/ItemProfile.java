package org.sprouts.digitalmusic.model.parser.items;

import java.util.List;

public class ItemProfile {

	// Attributes
	private int profile_id;
	private int number_items;

	private List<String> categories;

	// Constructor
	public ItemProfile() {
		super();
	}

	// Getters and setters
	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}

	public int getNumber_items() {
		return number_items;
	}

	public void setNumber_items(int number_items) {
		this.number_items = number_items;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
}
