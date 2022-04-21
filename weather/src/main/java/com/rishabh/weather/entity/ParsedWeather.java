package com.rishabh.weather.entity;

/**
 * @author rishabh
 *
 */

public class ParsedWeather {

	private String cityName;
	private String currentTemeprature;
	private String feelsLikeTemperature;
	private String maxTemp;
	private String minTemp;
	private String humidity;
	private String pressure;
	private String windSpeed;
	private String weatherCondition;
	private String dateTime;
	private int cod;

	public ParsedWeather(String cityName, String currentTemeprature, String feelsLikeTemperature, String maxTemp,
			String minTemp, String humidity, String pressure, String windSpeed, String weatherCondition,
			String dateTime, int cod) {
		this.cityName = cityName;
		this.currentTemeprature = currentTemeprature;
		this.feelsLikeTemperature = feelsLikeTemperature;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.windSpeed = windSpeed;
		this.weatherCondition = weatherCondition;
		this.dateTime = dateTime;
		this.cod = cod;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCurrentTemeprature() {
		return currentTemeprature;
	}

	public void setCurrentTemeprature(String currentTemeprature) {
		this.currentTemeprature = currentTemeprature;
	}

	public String getFeelsLikeTemperature() {
		return feelsLikeTemperature;
	}

	public void setFeelsLikeTemperature(String feelsLikeTemperature) {
		this.feelsLikeTemperature = feelsLikeTemperature;
	}

	public String getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

	public String getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	public ParsedWeather() {
		// TODO Auto-generated constructor stub
	}

}
