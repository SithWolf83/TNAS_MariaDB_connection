package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Spanish_Embassy_Phones")
public class SpanishEmbassyPhones implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id")
	private int countryId;
	@Column(name="Country_Name")
	private String countryName;
	@Column(name="Embassy")
	private boolean embassy;
	@Column(name="Consulate")
	private boolean consulate;
	@Column(name="City_Name")
	private String cityName;
	@Column(name="Phone")
	private String phone;
	
	public SpanishEmbassyPhones() {
		
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public boolean isEmbassy() {
		return embassy;
	}

	public void setEmbassy(boolean embassy) {
		this.embassy = embassy;
	}

	public boolean isConsulate() {
		return consulate;
	}

	public void setConsulate(boolean consulate) {
		this.consulate = consulate;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
