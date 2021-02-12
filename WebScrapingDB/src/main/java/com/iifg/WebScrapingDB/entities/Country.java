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
	@Column(name="Country_Eng_Name", nullable = false, columnDefinition = "varchar(50)")
	private String countryEngName;
	@Column(name="Country_Spa_Name", nullable = false, columnDefinition = "varchar(50)")
	private String countrySpaName;
	@Column(name="Capital_Name", nullable = false, columnDefinition = "varchar(50)")
	private String capitalName;
	@Column(name="EU_Country", nullable = false, columnDefinition = "default false")
	private boolean euCountry;
	
	public Country() {
		
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
	public String getCountryEngName() {
		return countryEngName;
	}
	public void setCountryEngName(String countryEngName) {
		this.countryEngName = countryEngName;
	}
	public String getCountrySpaName() {
		return countrySpaName;
	}
	public void setCountrySpaName(String countrySpaName) {
		this.countrySpaName = countrySpaName;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	@Override
	public String toString() {
		return "Country [countryEngName=" + countryEngName + ", countrySpaName=" + countrySpaName + ", capitalName="
				+ capitalName + ", euCountry=" + euCountry + "]";
	}
	
}
