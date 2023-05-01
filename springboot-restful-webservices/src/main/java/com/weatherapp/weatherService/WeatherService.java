package com.weatherapp.weatherService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.weatherapp.entity.Weather;
import com.weatherapp.repository.WeatherRepository;
 
@Service
public class WeatherService {
	
	@Autowired
    private WeatherRepository repo;
     
    public List<Weather> listAll() {
        return repo.findAll();
    }
     
    public Weather save(Weather weather) {
        Weather weather1 = repo.save(weather);
        return weather1;
    }
    public ResponseEntity<Weather> update(int id,Weather weather){
    Optional<Weather> optionalWeather = repo.findById(id);
    if (!optionalWeather.isPresent()) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    Weather existingWeather = optionalWeather.get();
    existingWeather.setDate(weather.getDate());
    existingWeather.setTemperatureC(weather.getTemperatureC());
    existingWeather.setSummary(weather.getSummary());
    existingWeather.setTemperatureC(weather.getTemperatureC());
    existingWeather.setCity(weather.getCity());
    Weather updatedWeather = repo.save(existingWeather);
    return new ResponseEntity<>(updatedWeather, HttpStatus.OK);
    }
    
    public Weather get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public Weather getWeatherByCity(String city) throws Exception {
        Optional<Weather> weather = repo.findByCity(city);
        if (weather.isPresent()) {
            return convertToWeather(weather.get());
        } else {
            throw new Exception("Weather data not found for city: " + city);
        }
    }

    private Weather convertToWeather(Weather weather) {
    	
        Weather WeatherTest = new Weather();
        WeatherTest.setId(weather.getId());
        WeatherTest.setCity(weather.getCity());
        WeatherTest.setDate(weather.getDate());
        WeatherTest.setTemperatureC(weather.getTemperatureC());
        WeatherTest.setTemperatureF(weather.getTemperatureF());
        WeatherTest.setSummary(weather.getSummary());
        return WeatherTest;
    }
    

}


