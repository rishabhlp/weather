/**
 *
 */
package com.rishabh.weather.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author rishabh
 *
 */
public class Wind {

	@JsonProperty("speed")
	private int speed;

	@JsonProperty("deg")
    private int deg;

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
	}
	public Wind() {
		// TODO Auto-generated constructor stub
	}
	public Wind(int speed, int deg) {
		this.speed = speed;
		this.deg = deg;
	}

}
