package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COVID19_DISEASE")
public class Covid19Disease implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id", nullable = false)
	private int countryId;
	@Column(name="Cases_Total", nullable = false)
	private int casesTotal;
	@Column(name="Cases_Last24h", nullable = false)
	private int casesLast24h;
	@Column(name="Deaths_Total", nullable = false)
	private int deathsTotal;
	@Column(name="Deaths_Last24h", nullable = false)
	private int deathsLast24h;
	@Column(name="Transmission_Classification", nullable = false)
	private int transClassification;
	
	public Covid19Disease() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getCasesTotal() {
		return casesTotal;
	}

	public void setCasesTotal(int casesTotal) {
		this.casesTotal = casesTotal;
	}

	public int getCasesLast24h() {
		return casesLast24h;
	}

	public void setCasesLast24h(int casesLast24h) {
		this.casesLast24h = casesLast24h;
	}

	public int getDeathsTotal() {
		return deathsTotal;
	}

	public void setDeathsTotal(int deathsTotal) {
		this.deathsTotal = deathsTotal;
	}

	public int getDeathsLast24h() {
		return deathsLast24h;
	}

	public void setDeathsLast24h(int deathsLast24h) {
		this.deathsLast24h = deathsLast24h;
	}

	public int getTransClassification() {
		return transClassification;
	}

	public void setTransClassification(int transClassification) {
		this.transClassification = transClassification;
	}
}
