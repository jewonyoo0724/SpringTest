package com.alpaca.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/test01")
public class Test01Controller {
		
	@RequestMapping("/1")
	@ResponseBody
	public String stringResponse()
	{
		return "<h1>Test Project Completed</h1><h3>Solutions made through this project</h2>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> mapResponse()
	{
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("Korean", 80);
		scoreMap.put("Math", 90);
		scoreMap.put("English", 85);
		
		return scoreMap;
	}
}
