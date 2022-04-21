package com.rishabh.weather.service;

import java.rmi.ServerException;

import org.springframework.stereotype.Service;

import com.rishabh.weather.boilerplate.ApplicationConstants;
import com.rishabh.weather.componentService.ComponentServiceExchange;
import com.rishabh.weather.entity.ParsedWeather;
import com.rishabh.weather.entity.ResponseWeatherObject;
import com.rishabh.weather.parser.WeatherParser;


/**
 * @author rishabh
 *
 */

@Service
public class WeatherService {


	private ComponentServiceExchange componentService=new ComponentServiceExchange();


	private WeatherParser weatherParser=new WeatherParser();

	public ParsedWeather weatherUpdate(String city) throws ServerException{
		StringBuilder  urlBuilder = new StringBuilder(ApplicationConstants.API_ENDPOINT);
		urlBuilder.append(city);
		ResponseWeatherObject responseWeatherObject = componentService.liveWeatherExchange(urlBuilder.toString());
		if(responseWeatherObject.getCod()==404) {
			ParsedWeather weather=new ParsedWeather();
			weather.setCod(responseWeatherObject.getCod());
			return weather;
		}
			
		ParsedWeather parsedWeather = weatherParser.parserService(responseWeatherObject);
		return parsedWeather;

	}

}
