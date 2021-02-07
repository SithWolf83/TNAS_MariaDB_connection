package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Traveller_Recommendations")
public class TravellerRecommendations implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Environmental_Health_Risks")
	private String environHealthRisks;
	@Column(name="Vaccines_Required")
	private String vaccinesRequired;
	@Column(name="Vaccines_Recommended")
	private String vaccinesRecommended;
	@Column(name="Malaria_Prevention")
	private String malariaPrevention;
	@Column(name="During_The_Trip")
	private String duringTheTrip;
	@Column(name="Beware_Of_Water")
	private String bewareOfWater;
	@Column(name="Beware_Of_Toilets")
	private String bewareOfToilets;
	@Column(name="Protection_Transmitted_Diseases")
	private String proTransDiseases;
	@Column(name="Sexually_Transmitted_Diseases")
	private String sexTransDiseases;
	@Column(name="Tips_After_The_Trip")
	private String tipsAftTrip;
	
	public TravellerRecommendations() {
		
	}

	public String getEnvironHealthRisks() {
		return environHealthRisks;
	}

	public void setEnvironHealthRisks(String environHealthRisks) {
		this.environHealthRisks = environHealthRisks;
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

	public String getMalariaPrevention() {
		return malariaPrevention;
	}

	public void setMalariaPrevention(String malariaPrevention) {
		this.malariaPrevention = malariaPrevention;
	}

	public String getDuringTheTrip() {
		return duringTheTrip;
	}

	public void setDuringTheTrip(String duringTheTrip) {
		this.duringTheTrip = duringTheTrip;
	}

	public String getBewareOfWater() {
		return bewareOfWater;
	}

	public void setBewareOfWater(String bewareOfWater) {
		this.bewareOfWater = bewareOfWater;
	}

	public String getBewareOfToilets() {
		return bewareOfToilets;
	}

	public void setBewareOfToilets(String bewareOfToilets) {
		this.bewareOfToilets = bewareOfToilets;
	}

	public String getProTransDiseases() {
		return proTransDiseases;
	}

	public void setProTransDiseases(String proTransDiseases) {
		this.proTransDiseases = proTransDiseases;
	}

	public String getSexTransDiseases() {
		return sexTransDiseases;
	}

	public void setSexTransDiseases(String sexTransDiseases) {
		this.sexTransDiseases = sexTransDiseases;
	}

	public String getTipsAftTrip() {
		return tipsAftTrip;
	}

	public void setTipsAftTrip(String tipsAftTrip) {
		this.tipsAftTrip = tipsAftTrip;
	}
}
