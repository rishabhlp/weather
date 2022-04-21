package com.rishabh.weather.componentService;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.rishabh.weather.entity.ResponseWeatherObject;



/**
 * @author rishabh
 *
 */

@Component
public class ComponentServiceExchange {


	RestTemplate restTemplate = new RestTemplate();


	public ResponseWeatherObject liveWeatherExchange(String url) {
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.set("X-RapidAPI-Host", "community-open-weather-map.p.rapidapi.com");
		httpHeaders.set("X-RapidAPI-Key", "340bc9d101msh383068e6f94e819p17b8aajsn98074330948f");
		HttpEntity<String> httpEntity=new HttpEntity<>(httpHeaders);
		HttpEntity<ResponseWeatherObject> responseWeatherObject;
		try {
			responseWeatherObject = restTemplate.exchange(url, HttpMethod.GET, httpEntity, ResponseWeatherObject.class);
			return responseWeatherObject.getBody();
		} catch(HttpClientErrorException exception) {
			ResponseWeatherObject responseWeatherObject2=new ResponseWeatherObject();
			responseWeatherObject2.setCod(404);
			return responseWeatherObject2;
		}

		

		/*
		 * ResponseWeatherObject object= restTemplate.getForObject(url,
		 * ResponseWeatherObject.class); return object;
		 */
	}


}
