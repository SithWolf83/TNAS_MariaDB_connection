package com.iifg.WebScrapingDB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/update")
public class InfoServicesController {

	/**
	 * Updates Meteo Alarms
	 * 
	 * @return
	 */
	@GetMapping("/meteoalarm")
	public @ResponseBody String updateMeteoAlarm() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates Earthquakes information
	 * 
	 * @return
	 */
	@GetMapping("/earthquakes")
	public @ResponseBody String updateEarthquakes() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Cleans a year old registers
	 * @return
	 */
	@GetMapping("/earthquakes/cleanyearly")
	public @ResponseBody String cleanYearlyEarthquakes() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates emergency phones by country
	 * @return
	 */
	@GetMapping("/emergencyphones")
	public @ResponseBody String updateEmergencyPhones() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates recommendations before visit a country
	 * @return
	 */
	@GetMapping("/countryrecommendations")
	public @ResponseBody String updateCountryRecommendations() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates country cards information
	 * 
	 * @return
	 */
	@GetMapping("/countrydetails")
	public @ResponseBody String updateCountryDetails() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates emergencies and disasters by country
	 * 
	 * @return
	 */
	@GetMapping("/emergencydisasters")
	public @ResponseBody String updateEmergencyAndDisasters() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates global information for travellers
	 * 
	 * @return
	 */
	@GetMapping("/travellerrecommendations")
	public @ResponseBody String updateTravellerRecommendations() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates country health situation by country
	 * 
	 * @return
	 */
	@GetMapping("/countryhealthsituations")
	public @ResponseBody String updateCountryHealthSituation() {
		String result = "";
		//**********************************
		return result;		
	}
	
	/**
	 * Updates covid19 diseases by country
	 * 
	 * @return
	 */
	@GetMapping("/covid19disease")
	public @ResponseBody String updateCovidDisease() {
		String result = "";
		//**********************************
		return result;		
	}
	
	
	
	
}
