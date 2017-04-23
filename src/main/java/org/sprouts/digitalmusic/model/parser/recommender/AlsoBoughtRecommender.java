package org.sprouts.digitalmusic.model.parser.recommender;

import java.util.List;

public class AlsoBoughtRecommender {

	private int item_id;
	private List<AlsoBought> alsoBought;

	//Constructor
	public AlsoBoughtRecommender(){
		super();
	}
	
	//Getter and setters
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public List<AlsoBought> getAlsoBought() {
		return alsoBought;
	}

	public void setAlsoBought(List<AlsoBought> alsoBought) {
		this.alsoBought = alsoBought;
	}
	
}
