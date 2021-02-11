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
@Table(name = "EARTHQUAKES")
public class Earthquake implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="Country_Id")
	private int countryId;
	@Column(name="City_Id")
	private int cityId;
	@Column(name="Richter_Scale")
	private float richterScale;
	@Column(name="People_Felt")
	private String peopleFelt;
	@Column(name="Date")
	private Date date;
	@Column(name="Time")
	private String time;
	@Column(name="Location")
	private String location;
	@Column(name="Depth")
	private String depth;
	
	public Earthquake() {
		
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

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public float getRichterScale() {
		return richterScale;
	}

	public void setRichterScale(float richterScale) {
		this.richterScale = richterScale;
	}

	public String getPeopleFelt() {
		return peopleFelt;
	}

	public void setPeopleFelt(String peopleFelt) {
		this.peopleFelt = peopleFelt;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}
	
}
