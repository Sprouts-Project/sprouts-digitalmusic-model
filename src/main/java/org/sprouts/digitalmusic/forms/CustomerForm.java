package org.sprouts.digitalmusic.forms;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.sprouts.digitalmusic.model.DomainEntity;
import org.sprouts.digitalmusic.model.UserAccount;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class CustomerForm extends DomainEntity {

    // Attributes -------------------------------------------------------------

    private String name;
    private String email;
    private Date birthdate;
    private String state;
    private String sex;
    private String username;
    private String password;
    private String oldPassword;

    // Constructors -----------------------------------------------------------

    public CustomerForm() {

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

    @Size(min = 0, max = 50)
    @NotBlank
    @Column(unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Size(min = 0, max = 500)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Size(min = 0, max = 500)
    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String password) {
        this.oldPassword = password;
    }

}
