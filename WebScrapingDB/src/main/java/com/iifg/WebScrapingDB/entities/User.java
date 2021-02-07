package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	@Column(name="Email")
	private String email;
	@Column(name="EU_Citizen")
	private boolean EU_Citizen;	
	@Column(name="Nationallity")
	private String nationallity;
	
	public User(){
		
	}
	
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getNationallity() {
		return nationallity;
	}

	public void setNationallity(String nationallity) {
		this.nationallity = nationallity;
	}

	@Override
	public String toString() {		
		return "User{" + username + ", " + password + ", " + email + "}";
	}	
}
