package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MeteoAlarm")
public class MeteoAlarm implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id")
	private int countryId;
	@Column(name="Country_Name")
	private String countryName;
	@Column(name="City_Name")
	private String cityName;
	@Column(name="From_Day")
	private Date fromDay;
	@Column(name="To_Day")
	private Date toDay;
	@Column(name="Alert_Type")
	private String alertType;
	@Column(name="Alert_Colour")
	private String alertColour;
	@Column(name="Alert_Message")
	private String alertMessage;
	
	public MeteoAlarm() {
		
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Date getFromDay() {
		return fromDay;
	}

	public void setFromDay(Date fromDay) {
		this.fromDay = fromDay;
	}

	public Date getToDay() {
		return toDay;
	}

	public void setToDay(Date toDay) {
		this.toDay = toDay;
	}

	public String getAlertType() {
		return alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public String getAlertColour() {
		return alertColour;
	}

	public void setAlertColour(String alertColour) {
		this.alertColour = alertColour;
	}

	public String getAlertMessage() {
		return alertMessage;
	}

	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}
}
