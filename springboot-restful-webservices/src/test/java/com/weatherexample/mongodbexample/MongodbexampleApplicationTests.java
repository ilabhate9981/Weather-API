package com.weatherexample.mongodbexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.weatherapp.entity.Weather;
import com.weatherapp.repository.WeatherRepository;
import com.weatherapp.weatherService.WeatherService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class MongodbexampleApplicationTests {

	
	@Autowired
    private WeatherService weatherService;
	@MockBean
	private WeatherRepository repo;

   @Test
    void testGetWeatherByCity() throws Exception {
        String city = "Pune";
        Weather weatherData = weatherService.getWeatherByCity(city);
        assertNotNull(weatherData);
        assertEquals(city, weatherData.getCity());
        assertNotNull(weatherData.getDate());
        assertNotNull(weatherData.getTemperatureC());
        assertNotNull(weatherData.getTemperatureF());
        assertNotNull(weatherData.getSummary());
        
    }

    @Test
    void testGetWeatherByCityNotFound() {
        String city = "Nonexistent City";
        assertThrows(Exception.class, () -> {
            weatherService.getWeatherByCity(city);
        });
    }
	public void getweatherTest() {
		
	}

}

