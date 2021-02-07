package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Use_EU_Medical_Card")
public class UseEUMedicalCard implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id")
	private int countryId;
	@Column(name="Country_Name")
	private String countryName;
	@Column(name="Emergencies")
	private String emergencies;
	@Column(name="Medical_Coverage")
	private String medicalCoverage;
	@Column(name="Medical_Refund")
	private String medicalRefund;
	@Column(name="Medical_Copay")
	private String medicalCopay;
	@Column(name="Special_Treatments")
	private String specialTreatments;
	@Column(name="Requests")
	private String requests;
	@Column(name="Places")
	private String places;
	@Column(name="Lost_Substraction")
	private String lostSubstracion;
	
	public UseEUMedicalCard() {
		
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

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getEmergencies() {
		return emergencies;
	}

	public void setEmergencies(String emergencies) {
		this.emergencies = emergencies;
	}

	public String getMedicalCoverage() {
		return medicalCoverage;
	}

	public void setMedicalCoverage(String medicalCoverage) {
		this.medicalCoverage = medicalCoverage;
	}

	public String getMedicalRefund() {
		return medicalRefund;
	}

	public void setMedicalRefund(String medicalRefund) {
		this.medicalRefund = medicalRefund;
	}

	public String getMedicalCopay() {
		return medicalCopay;
	}

	public void setMedicalCopay(String medicalCopay) {
		this.medicalCopay = medicalCopay;
	}

	public String getSpecialTreatments() {
		return specialTreatments;
	}

	public void setSpecialTreatments(String specialTreatments) {
		this.specialTreatments = specialTreatments;
	}

	public String getRequests() {
		return requests;
	}

	public void setRequests(String requests) {
		this.requests = requests;
	}

	public String getPlaces() {
		return places;
	}

	public void setPlaces(String places) {
		this.places = places;
	}

	public String getLostSubstracion() {
		return lostSubstracion;
	}

	public void setLostSubstracion(String lostSubstracion) {
		this.lostSubstracion = lostSubstracion;
	}
	
	
}
