package com.iifg.WebScrapingDB.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("SELECT a FROM User a WHERE a.username=:username")
	List<User> findByName(@Param("username") String username);
}
