package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPANISH_EMBASSY_PHONES")
public class SpanishEmbassyPhones implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id")
	private int countryId;
	@Column(name="Embassy")
	private boolean embassy;
	@Column(name="Consulate")
	private boolean consulate;
	@Column(name="Phone")
	private String phone;
	@Column(name="Direction")
	private String direction;
	
	public SpanishEmbassyPhones() {
		
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
