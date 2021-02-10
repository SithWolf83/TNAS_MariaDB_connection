package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
