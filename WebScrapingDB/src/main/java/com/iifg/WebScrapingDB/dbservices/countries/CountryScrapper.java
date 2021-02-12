package com.iifg.WebScrapingDB.dbservices.countries;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.iifg.WebScrapingDB.entities.Country;

public class CountryScrapper {

	private Document document;
	private String url = "https://www.nationsonline.org/oneworld/countrynames_spanish.htm";
	
	public CountryScrapper() {
		webConnection();
	}

	public void webConnection() {
		try {
			this.document = Jsoup.connect(url).timeout(10000).get();
		} catch (IOException e) {
			System.out.println("CountryScrapper - Error getting url: " + url);
		}
	}

	public List<Country> scrapper() {
		List<Country> countryList = new ArrayList<Country>();
		// Body selection from url
		Element body = document.body();
		int i = 0;
		// Table selection by "tr" >> row
		for (Element row : body.select("table.tl tr")) {
			// Celda selction by >> "td"
			Country country = new Country();
			for (Element celda : row.select("td")) {
				if ((celda.text().length() > 1 && !celda.text().equalsIgnoreCase("")) // Removes letter alphabet and empty celdas
						|| (i > 0 && celda.text().equalsIgnoreCase(""))) {			// Allow empty capital name
					switch (i) {
					case 0:
						System.out.println("Country.ENG: " + celda.text());
						country.setCountryEngName(celda.text());
						break;
					case 1:
						System.out.println("Country.SPA: " + celda.text());
						country.setCountrySpaName(celda.text());
						break;
					case 2:
						System.out.println("Capital: " + celda.text());
						if (celda.text().equalsIgnoreCase("")) {
							country.setCapitalName(country.getCountrySpaName().toString());
						} else {
							country.setCapitalName(celda.text());
						}
						break;
					case 3:
						System.out.println("Continente: " + celda.text());
						break;
					}
					i++;
					if (i == 4) {
						System.out.println("###");
						i = 0;
						System.out.println(country.toString());
						countryList.add(country);
						System.out.println("###");
					}
				}
			}
		}
		return countryList;
	}

}
