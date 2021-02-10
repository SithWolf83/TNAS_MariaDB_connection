package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.SpanishEmbassyPhones;

@Repository
public interface SpaEmbassyPhonesRepository extends CrudRepository<SpanishEmbassyPhones, Integer> {

}
