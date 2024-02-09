package com.admission.university.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Forms")


public class entity {
	@Id
	@Column(name="UserName") 
	private String username;
	@Column(name="Password")
	private String Password;
	


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
    public String getPassword() {
		return Password;
	}
     public void setPassword(String password) {
		Password = password;
	}
     
    public entity(String username, String password) {
		super();
		this.username = username;
		Password = password;
	}
  
}