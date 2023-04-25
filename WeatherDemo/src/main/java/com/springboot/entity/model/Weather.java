package com.springboot.entity.model;




import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class Weather {
	
	private int Id;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	private int temperatureC;
	private String summary;
	private int temperatureF;
	private String city;
	

	public Weather(int id, Date date, int temperatureC, String summary, int temperatureF, String city) {
		super();
		Id = id;
		this.date = date;
		this.temperatureC = temperatureC;
		this.summary = summary;
		this.temperatureF = temperatureF;
		this.city = city;
	}
	@jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId1() {
        return Id;
    }
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTemperatureC() {
		return temperatureC;
	}
	public void setTemperatureC(int temperatureC) {
		this.temperatureC = temperatureC;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getTemperatureF() {
		return temperatureF;
	}
	public void setTemperatureF(int temperatureF) {
		this.temperatureF = temperatureF;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}