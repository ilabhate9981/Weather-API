package com.weatherapp.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapp.entity.Weather;
import com.weatherapp.repository.WeatherRepository;
import com.weatherapp.weatherService.WeatherService;
 

@RestController
public class WeatherController {
 
    @Autowired
    private WeatherService service;
    
   
    
    @GetMapping("/getweather")
    public List<Weather> list() {
        return service.listAll();
    }
    
    @GetMapping("/weather/{id}")
    public ResponseEntity<Weather> get(@PathVariable Integer id) {
        try {
            Weather weather= service.get(id);
            return new ResponseEntity<Weather>(weather, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Weather>(HttpStatus.NOT_FOUND);
        }      
    }
    
    @PostMapping("/weather")
    public ResponseEntity<?> addweather(@RequestBody Weather weather) {
    	try {
        	
            service.save(weather);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }    
        
    }
    @PutMapping("/updateweather/{id}")
    public ResponseEntity<Weather> updateweather(@PathVariable int id, @RequestBody Weather weather) {
        return service.update(id, weather);
    }
  
    
    @DeleteMapping("/weather/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
}

    
    
    
    






	
































































































/*import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.mongodb.repository.MongoRepository;
	import org.springframework.data.repository.CrudRepository;
	import org.springframework.data.repository.ListCrudRepository;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	/*import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	/*import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.model.Weather;






	@RestController
	@RequestMapping("/weather")
	public class Mycontroller {
		
			@Autowired
		private com.Repository.WeatherRepository weatherRepository;
			
	        @PostMapping("/")
			public ResponseEntity<?> addWeather(@RequestBody Weather weather){
		    Weather save =this.weatherRepository.save(weather);
		   return ResponseEntity.ok(save);
		}
			@GetMapping("/")
			public ResponseEntity<?> getweather(){
		    return ResponseEntity.ok(this.weatherRepository.findAll());
		    }*/
	
		/*@PostMapping(value="/addWeather" )
		public String saveWeather(@RequestBody Weather weather){ 
			repo.save(weather); 
			return "Added Successfully"; 

	    } 
		//@GetMapping("/error")
	    	
	    
	    
	  
		@GetMapping("/findAllBooks") 
	    public List<Weather> getBooks() { 
			
	       return repo.findAll(); 

	    } 

	  

	    @DeleteMapping("/delete/{id}") 

	    public String deleteBook(@PathVariable int id){ 

	        repo.deleteById(id); 
	        return "Deleted Successfully"; 

	    } 
	   
	    
	}
		
		



	/*@GetMapping("/")
		public ResponseEntity<?> getweather(){
		return ResponseEntity.ok(this.weatherRepository.findAll());
		}*/
		
		/*@Autowired
	    public MongodbService service;*/		
			
		
		/*public ResponseEntity<?> addweather(@RequestBody Weather weather ){*/
			
		/*Weather weather1=service.savedata(weather);	
	    return ResponseEntity.ok(weather1);*/
			/*Weather save= this.weatherRepository.save(weather);	
	    return ResponseEntity.ok(save);
		}*/






