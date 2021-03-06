package org.sprouts.digitalmusic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="useraccount")
public class UserAccount extends DomainEntity implements UserDetails {

	// Attributes -------------------------------------------------------------

	private static final long serialVersionUID = -5862407957683765140L;
	private String username;
	private String password;
	private Set<Authority> authorities;

	// Constructors -----------------------------------------------------------

	public UserAccount() {
		super();
	}

	// Getters/Setters --------------------------------------------------------

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

	@ManyToMany
	@JoinTable(name = "user_authority", joinColumns = @JoinColumn(name = "user_account"), inverseJoinColumns = @JoinColumn(name = "authority"))
	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	@Transient
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Transient
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Transient
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Transient
	@Override
	public boolean isEnabled() {
		return true;
	}
}
