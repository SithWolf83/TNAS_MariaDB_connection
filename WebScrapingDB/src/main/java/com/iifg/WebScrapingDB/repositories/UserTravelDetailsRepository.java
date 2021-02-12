package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.UserTripDetails;

@Repository
public interface UserTravelDetailsRepository extends CrudRepository<UserTripDetails, Integer> {

}
