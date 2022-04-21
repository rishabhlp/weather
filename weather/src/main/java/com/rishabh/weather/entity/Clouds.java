/**
 *
 */
package com.rishabh.weather.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author rishabh
 *
 */
public class Clouds {

	@JsonProperty("all")
	private int all;

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	public Clouds(int all) {
		this.all = all;
	}

	public Clouds() {
		// TODO Auto-generated constructor stub
	}
}
