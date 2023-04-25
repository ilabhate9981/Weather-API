package com.weatherapp.entity;




import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Weather {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	private int temperatureC;
	private String summary;
	private int temperatureF;
	private String city;
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
	public Weather(int id, Date date, int temperatureC, String summary, int temperatureF, String city) {
		super();
		Id = id;
		this.date = date;
		this.temperatureC = temperatureC;
		this.summary = summary;
		this.temperatureF = temperatureF;
		this.city = city;
	}
	public Weather() {

		// TODO Auto-generated constructor stub
	}
	
	
	

}