package com.rishabh.weather.parser;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.rishabh.weather.entity.ParsedWeather;
import com.rishabh.weather.entity.ResponseWeatherObject;

/**
 * @author rishabh
 *
 */

public class WeatherParser {

	public ParsedWeather parserService(ResponseWeatherObject responseWeatherObject) {

		ParsedWeather parsedWeather = new ParsedWeather();

		if (null != responseWeatherObject) {
			parsedWeather.setCityName(responseWeatherObject.getName());
			parsedWeather.setCurrentTemeprature(
					String.format("%.02f", (farenheightToCelciusConverter(responseWeatherObject.getMain().getTemp())))
							+ " °C");
			parsedWeather.setFeelsLikeTemperature(String.format("%.02f",
					farenheightToCelciusConverter(responseWeatherObject.getMain().getFeels_like())) + " °C");
			parsedWeather.setMaxTemp(
					String.format("%.02f", farenheightToCelciusConverter(responseWeatherObject.getMain().getTemp_max()))
							+ " °C");
			parsedWeather.setMinTemp(
					String.format("%.02f", farenheightToCelciusConverter(responseWeatherObject.getMain().getTemp_min()))
							+ " °C");
			parsedWeather.setHumidity(responseWeatherObject.getMain().getHumidity() + "%");
			parsedWeather.setPressure(responseWeatherObject.getMain().getPressure() + " hPA");
			parsedWeather.setWindSpeed(responseWeatherObject.getWind().getSpeed() + " km/h");
			parsedWeather.setWeatherCondition(responseWeatherObject.getWeather().get(0).getDescription());
			parsedWeather.setDateTime(dateTimeGenerator());
			parsedWeather.setCod(responseWeatherObject.getCod());
		}

		return parsedWeather;

	}

	public double farenheightToCelciusConverter(double farenheightTemp) {

		if (farenheightTemp > 300.0)
			return farenheightTemp - 273.15;
		else
			return farenheightTemp - 273.15;
//					(((5 * (farenheightTemp - 32.0)) / 9.0));
	}

	public String dateTimeGenerator() {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    Date date = new Date();
		    return formatter.format(date);
	}

}
