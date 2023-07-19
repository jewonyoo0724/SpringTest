package com.alpaca.spring.test.jstl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alpaca.spring.test.jstl.domain.Weather;
import com.alpaca.spring.test.jstl.service.WeatherService;

@Controller
@RequestMapping("/jstl")
public class JSTLController {

	@GetMapping("/test01")
	public String test01()
	{
		return "jstl/test01";
	}
	
	@GetMapping("/test02")
	public String test02(Model model)
	{
		List<String> musicRanking = new ArrayList<>();
		musicRanking.add("강남스타일");
		musicRanking.add("벚꽃엔딩");
		musicRanking.add("좋은날");
		musicRanking.add("거짓말");
		musicRanking.add("보고싶다");
		
		model.addAttribute("musicRanking", musicRanking);
		
		List<Map<String, Object>> membership = new ArrayList<>();

		Map<String, Object> member = new HashMap<>();
		member.put("name", "손오공");
		member.put("phoneNumber", "010-1234-5678");
		member.put("grade", "VIP");
		member.put("point", 12040);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "저팔계");
		member.put("phoneNumber", "010-4321-1234");
		member.put("grade", "BASIC");
		member.put("point", 3420);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "사오정");
		member.put("phoneNumber", "010-8888-1111");
		member.put("grade", "GOLD");
		member.put("point", 1530);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "삼장");
		member.put("phoneNumber", "010-0000-1234");
		member.put("grade", "GOLD");
		member.put("point", 8450);
		membership.add(member);

		member = new HashMap<>();
		member.put("name", "우마왕");
		member.put("phoneNumber", "010-1111-2222");
		member.put("grade", "BASIC");
		member.put("point", 420);
		membership.add(member);
		
		model.addAttribute("membership", membership);
		
		return "jstl/test02";
	}
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/test05")
	public String getWeather(Model model)
	{
		List<Weather> weatherList = weatherService.getWeatherList();
		
		model.addAttribute("weatherList", weatherList);
		
		return "jstl/test05";
	}
	
	@GetMapping("/weatherinput")
	public String weatherInput()
	{
		return "jstl/weatherinput";
	}
	
	@PostMapping("/test05/input")
	public String addWeather(
			//2017년 8월 16일
//			@RequestParam("date") @DateTimeFormat(pattern="yyyy년 MM월 dd일") Date date,
//			@RequestParam("weather") String weather,
//			@RequestParam("temperature") double temperature,
//			@RequestParam("precipitation") double precipitation,
//			@RequestParam("microdust") String microDust,
//			@RequestParam("windspeed") double windspeed
			@ModelAttribute Weather weather)
	{
//		int count = weatherService.addWeather(date, weather, temperature, precipitation, microDust, windspeed);
		
		int count = weatherService.addWeatherByObject(weather);
		
		//redirect (spring ver.)
		return "redirect:/jstl/test05";
	}
	
}
