package com.iifg.WebScrapingDB.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iifg.WebScrapingDB.dbservices.countries.CountryScrapper;
import com.iifg.WebScrapingDB.entities.Country;
import com.iifg.WebScrapingDB.repositories.CountryRepository;

@Controller
@RequestMapping("/update")
public class InfoServicesController {
	
	private CountryRepository countryRepo;

	@Autowired
	public InfoServicesController(CountryRepository countryRepo) {
		this.countryRepo = countryRepo;
	}
	
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
	
	/**
	 * Updates use of EU Health Card by country
	 * @return
	 */
	@GetMapping("/euhealthcard")
	public @ResponseBody String updateUseEUHealthCard() {
		String result = "";
		//**********************************
		return result;
	}
	
	/**
	 * Fills COUNTRY Table
	 * @return
	 */
	@GetMapping("/fillcountries")
	public @ResponseBody String fillCountriesTable() {
		boolean result = false;
		
		CountryScrapper countryScrapper = new CountryScrapper();
		List<Country> countryList = countryScrapper.scrapper();
		if(!countryList.isEmpty()) {
			for (Country country : countryList) {
				countryRepo.save(country);
			}
			result = true;
		}
		if (result) {
			return "Table filled";
		} else {
			return "There was an error.";
		}
		
	}
}
