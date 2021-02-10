package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.UserContactsDetails;

@Repository
public interface UserContactsDetailsRepository extends CrudRepository<UserContactsDetails, Integer> {

}
