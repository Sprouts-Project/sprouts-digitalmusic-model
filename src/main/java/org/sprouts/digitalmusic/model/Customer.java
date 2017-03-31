package org.sprouts.digitalmusic.model;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
@Table
public class Customer extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String name;
	private String email;
	private Date birthdate;
	private String state;
	private String sex;

	// Constructors -----------------------------------------------------------
	
	public Customer() {

	}

	// Getters/Setters --------------------------------------------------------
	
	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotBlank
	@Email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm")
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@NotBlank
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@NotBlank
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	// Relationships ----------------------------------------------------------
	
	private UserAccount userAccount;

    @NotNull
    @Valid
    @OneToOne(optional = false)
    @JoinColumn(name = "userAccountId")
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
