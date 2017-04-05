package org.sprouts.digitalmusic.model;

import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;

@Embeddable
public class CreditCard {
	
	// Attributes -------------------------------------------------------------

	private int cvv;
	private String brand;
	private String expire;
	private String number;

	// Constructors -----------------------------------------------------------
	
	public CreditCard() {

	}

	// Getters/Setters --------------------------------------------------------
	
	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@NotBlank
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@NotBlank
	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}

	@NotBlank
	@CreditCardNumber
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
