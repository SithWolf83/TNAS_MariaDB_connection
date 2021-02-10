package com.iifg.WebScrapingDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iifg.WebScrapingDB.entities.MeteoAlarm;

@Repository
public interface MeteoAlarmRepository extends CrudRepository<MeteoAlarm, Integer> {

}
