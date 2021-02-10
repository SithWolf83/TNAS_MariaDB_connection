package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.UseEUMedicalCard;

@Repository
public interface UseEUMedicalCardRepository extends CrudRepository<UseEUMedicalCard, Integer> {

}
