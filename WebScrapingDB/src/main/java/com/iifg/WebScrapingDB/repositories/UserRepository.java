package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

//	User findByName(String username);
}
