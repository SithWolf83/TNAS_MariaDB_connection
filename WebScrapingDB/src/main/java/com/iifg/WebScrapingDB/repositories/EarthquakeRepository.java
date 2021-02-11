package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.Earthquake;

@Repository
public interface EarthquakeRepository extends CrudRepository<Earthquake, Integer> {

}
