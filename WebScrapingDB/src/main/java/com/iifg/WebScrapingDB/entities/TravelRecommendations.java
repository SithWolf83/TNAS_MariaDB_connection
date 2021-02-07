package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Travel_Recommendations")
public class TravelRecommendations implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id")
	private String countryId;
	@Column(name="Important_Notes")
	private String importantNotes;
	@Column(name="Documentation_Visas")
	private String documentationVisas;
	@Column(name="Security")
	private String security;
	@Column(name="Healthcare")
	private String healthcare;
	@Column(name="Local_Currency")
	private String localCurrency;
	@Column(name="Other_Information")
	private String otherInformation;
	@Column(name="Other_Phones_Interest")
	private String addressesPhonesInterest;
	
	public TravelRecommendations() {
		
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getImportantNotes() {
		return importantNotes;
	}

	public void setImportantNotes(String importantNotes) {
		this.importantNotes = importantNotes;
	}

	public String getDocumentationVisas() {
		return documentationVisas;
	}

	public void setDocumentationVisas(String documentationVisas) {
		this.documentationVisas = documentationVisas;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(String healthcare) {
		this.healthcare = healthcare;
	}

	public String getLocalCurrency() {
		return localCurrency;
	}

	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public String getAddressesPhonesInterest() {
		return addressesPhonesInterest;
	}

	public void setAddressesPhonesInterest(String addressesPhonesInterest) {
		this.addressesPhonesInterest = addressesPhonesInterest;
	}
}
