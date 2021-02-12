package com.iifg.WebScrapingDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USE_UE_MEDICAL_CARD")
public class UseEUMedicalCard implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id")
	private int countryId;
	@Column(name="Emergencies", columnDefinition = "TEXT")
	private String emergencies;
	@Column(name="Medical_Coverage", columnDefinition = "TEXT")
	private String medicalCoverage;
	@Column(name="Medical_Refund", columnDefinition = "TEXT")
	private String medicalRefund;
	@Column(name="Medical_Copay", columnDefinition = "TEXT")
	private String medicalCopay;
	@Column(name="Special_Treatments", columnDefinition = "TEXT")
	private String specialTreatments;
	@Column(name="Requests", columnDefinition = "TEXT")
	private String requests;
	@Column(name="Places", columnDefinition = "TEXT")
	private String places;
	@Column(name="Lost_Substraction", columnDefinition = "TEXT")
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
