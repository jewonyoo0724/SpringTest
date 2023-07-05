package com.alpaca.spring.test.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TestController {

	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld()
	{
		return "Hello World";
	}
}
