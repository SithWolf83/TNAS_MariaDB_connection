package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.Covid19Disease;

@Repository
public interface Covid19Repository extends CrudRepository<Covid19Disease, Integer> {

}
