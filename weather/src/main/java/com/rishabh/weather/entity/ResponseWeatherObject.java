package com.rishabh.weather.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseWeatherObject {

	@JsonProperty("coord")
	public Coordinates coord;

	@JsonProperty("weather")
	public ArrayList<Weather> weather;

	@JsonProperty("base")
	public String base;

	@JsonProperty("main")
	public Temperature temp;

	@JsonProperty("visibility")
	public int visibility;

	@JsonProperty("wind")
	public Wind wind;

	@JsonProperty("clouds")
	public Clouds clouds;

	@JsonProperty("dt")
	public int dt;

	@JsonProperty("sys")
	public SunSystem sys;

	@JsonProperty("timezone")
	public int timezone;

	@JsonProperty("id")
	public int id;

	@JsonProperty("name")
	public String name;

	@JsonProperty("cod")
	public int cod;

	public Coordinates getCoord() {
		return coord;
	}

	public void setCoord(Coordinates coord) {
		this.coord = coord;
	}

	public ArrayList<Weather> getWeather() {
		return weather;
	}

	public void setWeather(ArrayList<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Temperature getMain() {
		return temp;
	}

	public void setMain(Temperature main) {
		this.temp = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public SunSystem getSys() {
		return sys;
	}

	public void setSys(SunSystem sys) {
		this.sys = sys;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public ResponseWeatherObject(Coordinates coord, ArrayList<Weather> weather, String base, Temperature main,
			int visibility, Wind wind, Clouds clouds, int dt, SunSystem sys, int timezone, int id, String name,
			int cod) {
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.temp = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}

	public ResponseWeatherObject() {
		// TODO Auto-generated constructor stub
	}

}
