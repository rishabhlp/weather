package com.rishabh.weather.controller;

import java.rmi.ServerException;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rishabh.weather.boilerplate.ApplicationConstants;
import com.rishabh.weather.entity.InputData;
import com.rishabh.weather.entity.ParsedWeather;
import com.rishabh.weather.service.WeatherService;


/**
 * @author rishabh
 *
 */


@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class WeatherController implements ErrorController{


	private WeatherService weatherService=new WeatherService();

	@GetMapping(value = ApplicationConstants.WEATHER_ENDPOINT)
	public ResponseEntity<ParsedWeather> weatherStatus(@PathVariable("city")String cityName ) throws ServerException{

		ParsedWeather parsedWeather=new ParsedWeather();
		parsedWeather=weatherService.weatherUpdate(cityName);
		return new ResponseEntity<>(parsedWeather,HttpStatus.OK);

	}

	 @RequestMapping(value = ApplicationConstants.SLASH)
	 	public ModelAndView index () {
		    ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("index.html");
		    return modelAndView;
		}


	@PostMapping(value = ApplicationConstants.WEATHER)
	public ModelAndView save(@ModelAttribute InputData inputData) throws ServerException {
		if(null==inputData || null==inputData.getCityName() || ApplicationConstants.BLANK.equalsIgnoreCase(inputData.getCityName())) {
			 ModelAndView modelAndView = new ModelAndView();
			    modelAndView.setViewName("invalid-input.html");
			    return modelAndView;
		}
		ParsedWeather parsedWeather=new ParsedWeather();
		parsedWeather=weatherService.weatherUpdate(inputData.getCityName());
		if(404==parsedWeather.getCod()) {
			ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("city-error.html");
		    return modelAndView;
		}
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("weather-output.html");
		modelAndView.addObject("parsedWeather",parsedWeather);
		return modelAndView;
	}



	@GetMapping(value = ApplicationConstants.ERROR)
	public ModelAndView error () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("error.html");
	    return modelAndView;
	}



}
