package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.City;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

}
