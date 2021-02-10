package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Country_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer countryId;
	@Column(name="Country_Name")
	private String countryName;
	@Column(name="EU_Country")
	private boolean euCountry;
	
	public Country() {
		
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public boolean isEuCountry() {
		return euCountry;
	}
	public void setEuCountry(boolean euCountry) {
		this.euCountry = euCountry;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}	
	
	
	
}
