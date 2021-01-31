package com.iifg.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.iifg.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByName(String username);
}
