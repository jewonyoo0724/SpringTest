package com.alpaca.spring.test.jstl.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.spring.test.jstl.domain.Weather;
import com.alpaca.spring.test.jstl.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<Weather> getWeatherList()
	{
		List<Weather> weatherList = weatherRepository.selectWeatherList();
		return weatherList;
	}
	
	public int addWeather(Date date, String weather, double temperature, double precipitation, String microDust, double windspeed)
	{
		int count = weatherRepository.insertWeather(date, weather, temperature, precipitation, microDust, windspeed);
		return count;
	}
	
	public int addWeatherByObject(Weather weather)
	{
		int count = weatherRepository.insertWeatherByObject(weather);
		return count;
	}
}
