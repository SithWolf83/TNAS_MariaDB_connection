package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.TravelRecommendations;

@Repository
public interface TravelRecommendRepository extends CrudRepository<TravelRecommendations, Integer> {

}
