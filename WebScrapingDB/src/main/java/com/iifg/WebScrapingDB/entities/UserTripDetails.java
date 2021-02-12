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
@Table(name = "USER_TRIP_DETAILS")
public class UserTripDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="User_Id", nullable = false)
	private int userId;
	@Column(name="From_Day", nullable = false)
	private Date fromDay;
	@Column(name="toDay", nullable = false)
	private Date toDay;
	@Column(name="City_Id", nullable = false)
	private int cityId;
	
	public UserTripDetails() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
