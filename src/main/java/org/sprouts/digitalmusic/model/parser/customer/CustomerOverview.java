package org.sprouts.digitalmusic.model.parser.customer;

import java.util.List;

public class CustomerOverview {

	private Object _id;
	private double average_age;
	private double average_age_male;
	private double average_age_female;
	
	private List<CustomerAverageAgeByState> average_age_by_state;
	private List<CustomerByState> customers_by_state;
	
	//Constructor
	public CustomerOverview(){
		super();
	}
	
	//Getter and setters
	
	public Object get_id() {
		return _id;
	}

	public void set_id(Object _id) {
		this._id = _id;
	}
	
	public double getAverage_age() {
		return average_age;
	}

	public void setAverage_age(double average_age) {
		this.average_age = average_age;
	}

	public double getAverage_age_male() {
		return average_age_male;
	}

	public void setAverage_age_male(double average_age_male) {
		this.average_age_male = average_age_male;
	}

	public double getAverage_age_female() {
		return average_age_female;
	}

	public void setAverage_age_female(double average_age_female) {
		this.average_age_female = average_age_female;
	}

	public  List<CustomerAverageAgeByState> getAverage_age_by_state() {
		return average_age_by_state;
	}

	public void setAverage_age_by_state( List<CustomerAverageAgeByState> average_age_by_state) {
		this.average_age_by_state = average_age_by_state;
	}

	public List<CustomerByState> getCustomers_by_state() {
		return customers_by_state;
	}

	public void setCustomers_by_state(List<CustomerByState> customers_by_state) {
		this.customers_by_state = customers_by_state;
	}
}
