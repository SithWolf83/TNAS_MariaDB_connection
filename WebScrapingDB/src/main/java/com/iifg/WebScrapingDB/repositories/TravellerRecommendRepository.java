package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.TravellerRecommendations;

@Repository
public interface TravellerRecommendRepository extends CrudRepository<TravellerRecommendations, Integer> {

}
