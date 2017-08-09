package com.work.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  id;
	@Column(unique=true,nullable=false)
	private String username;
	@Size(min=8)
	@NotEmpty(message="must contain atleast 8 or more characters")
	private String password;
	private boolean enabled;
	
	@OneToOne(mappedBy="user")
	private Tourist tourist;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Tourist getTourist() {
		return tourist;
	}

	public void setTourist(Tourist tourist) {
		this.tourist = tourist;
	}
	
	

}
