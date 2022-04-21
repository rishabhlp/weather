package com.rishabh.weather.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {

	@JsonProperty("temp")
	private double temp;

	@JsonProperty("feels_like")
	private double feelsLike;

	@JsonProperty("temp_min")
	private double tempMin;

	@JsonProperty("temp_max")
	private double tempMax;

	@JsonProperty("pressure")
	private int pressure;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("sea_level")
	private int seaLevel;

	@JsonProperty("grnd_level")
	private int grndLevel;

	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getFeels_like() {
		return feelsLike;
	}
	public void setFeels_like(double feels_like) {
		this.feelsLike = feels_like;
	}
	public double getTemp_min() {
		return tempMin;
	}
	public void setTemp_min(double temp_min) {
		this.tempMin = temp_min;
	}
	public double getTemp_max() {
		return tempMax;
	}
	public void setTemp_max(double temp_max) {
		this.tempMax = temp_max;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public int getSea_level() {
		return seaLevel;
	}
	public void setSea_level(int sea_level) {
		this.seaLevel = sea_level;
	}
	public int getGrnd_level() {
		return grndLevel;
	}
	public void setGrnd_level(int grnd_level) {
		this.grndLevel = grnd_level;
	}

	public Temperature(double temp, double feels_like, double temp_min, double temp_max, int pressure,
			int humidity, int sea_level, int grnd_level) {
		this.temp = temp;
		this.feelsLike = feels_like;
		this.tempMin = temp_min;
		this.tempMax = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
		this.seaLevel = sea_level;
		this.grndLevel = grnd_level;
	}
	public Temperature() {
		// TODO Auto-generated constructor stub
	}

}
