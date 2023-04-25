package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.model.Weather;
@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {
 
}
