package com.alpaca.spring.test.jstl.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.alpaca.spring.test.jstl.domain.Weather;

@Repository
public interface WeatherRepository {

	public List<Weather> selectWeatherList();
	
	public int insertWeather(
			@Param("date") Date date,
			@Param("weather") String weather, 
			@Param("temperature") double temperature, 
			@Param("precipitation") double precipitation,
			@Param("microdust") String microDust,
			@Param("windspeed") double windspeed);
	
	public int insertWeatherByObject(Weather weather);
}
