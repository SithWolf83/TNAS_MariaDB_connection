package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY_DETAILS")
public class CountryDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id", nullable = false, columnDefinition = "varchar(50)")
	private int countryId;
	@Column(name="Capital", nullable = false, columnDefinition = "varchar(50)")
	private String capital;
	@Column(name="Altitude", nullable = false, columnDefinition = "varchar(50)")
	private String altitude;
	@Column(name="Language", nullable = false, columnDefinition = "varchar(50)")
	private String language;
	@Column(name="Population", nullable = false, columnDefinition = "varchar(50)")
	private String population;
	@Column(name="Currency", nullable = false, columnDefinition = "varchar(50)")
	private String currency;
	@Column(name="Time_Zone", nullable = false, columnDefinition = "varchar(50)")
	private String timeZone;
	@Column(name="Weather", nullable = false, columnDefinition = "TEXT")
	private String weather;
	@Column(name="Vaccines_Required", nullable = false, columnDefinition = "TEXT")
	private String vaccinesRequired;
	@Column(name="Vaccines_Recommended", nullable = false, columnDefinition = "TEXT")
	private String vaccinesRecommended;
	
	public CountryDetails() {
		
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getVaccinesRequired() {
		return vaccinesRequired;
	}

	public void setVaccinesRequired(String vaccinesRequired) {
		this.vaccinesRequired = vaccinesRequired;
	}

	public String getVaccinesRecommended() {
		return vaccinesRecommended;
	}

	public void setVaccinesRecommended(String vaccinesRecommended) {
		this.vaccinesRecommended = vaccinesRecommended;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
