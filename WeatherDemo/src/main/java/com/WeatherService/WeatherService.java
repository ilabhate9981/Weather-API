package com.WeatherService;

import java.util.List;


 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.WeatherRepository;
import com.springboot.entity.model.Weather;

import jakarta.transaction.TransactionScoped;
 
@Service
@TransactionScoped
public class WeatherService {
	@Autowired
    private WeatherRepository repo;
     
    public List<Weather> listAll() {
        return repo.findAll();
    }
     
    public void save(Weather weather) {
        repo.save(weather);
    }
     
    public Weather get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}


