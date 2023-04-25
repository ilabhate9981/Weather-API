package com.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weatherapp.entity.Weather;
@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {
 
}
