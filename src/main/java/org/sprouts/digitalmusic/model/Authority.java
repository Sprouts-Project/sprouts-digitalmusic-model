package org.sprouts.digitalmusic.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="authority")
public class Authority extends DomainEntity implements GrantedAuthority {

    // Attributes -------------------------------------------------------------

	private static final long serialVersionUID = -5921253806189601214L;
	private String authority;

    // Constructors -----------------------------------------------------------

    public Authority() {
        super();
    }

    // Getters/Setters --------------------------------------------------------

    @NotNull
    @Size(min = 0, max = 50)
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
    
}
