package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.CountryDetails;

@Repository
public interface CountryDetailsRepository extends CrudRepository<CountryDetails, Integer> {

}
