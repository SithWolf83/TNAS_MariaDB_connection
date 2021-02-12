package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="UserId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Column(name="Username", nullable = false, columnDefinition = "varchar(50)")
	private String username;
	@Column(name="Password",nullable = false, columnDefinition = "varchar(50)")
	private String password;
	@Column(name="Email", nullable = false, columnDefinition = "varchar(50)")
	private String email;
	@Column(name="EU_Citizen")
	private boolean EU_Citizen;	
	@Column(name="Country_Id")
	private int countryId;
	
	public User(){
		
	}
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isEU_Citizen() {
		return EU_Citizen;
	}

	public void setEU_Citizen(boolean eU_Citizen) {
		EU_Citizen = eU_Citizen;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	@Override
	public String toString() {		
		return "User{" + username + ", " + password + ", " + email + "}";
	}	
}
