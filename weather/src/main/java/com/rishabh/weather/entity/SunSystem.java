/**
 *
 */
package com.rishabh.weather.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author rishabh
 *
 */
public class SunSystem {

	@JsonProperty("type")
	private int type;

	@JsonProperty("id")
	private int id;

	@JsonProperty("country")
	private String country;

	@JsonProperty("sunrise")
	private int sunrise;

	@JsonProperty("sunset")
	private int sunset;

	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSunrise() {
		return sunrise;
	}
	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}
	public int getSunset() {
		return sunset;
	}
	public void setSunset(int sunset) {
		this.sunset = sunset;
	}
	public SunSystem(int type, int id, String country, int sunrise, int sunset) {
		this.type = type;
		this.id = id;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public SunSystem() {
		// TODO Auto-generated constructor stub
	}

}
