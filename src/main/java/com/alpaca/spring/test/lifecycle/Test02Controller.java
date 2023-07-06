package com.alpaca.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test02Controller {

	@RequestMapping("/1")
	public List<Map<String, Object>> mapListResponse()
	{
		List<Map<String, Object>> filmList = new ArrayList<>();
		
		Map<String, Object> filmInfo = new HashMap<>();
		filmInfo.put("rate", 15);
		filmInfo.put("director", "Bong Jun-Ho");
		filmInfo.put("time", 131);
		filmInfo.put("title", "Parasite");
		filmList.add(filmInfo);
		
		
		filmInfo = new HashMap<>();
		filmInfo.put("rate", 0);
		filmInfo.put("director", "Roberto Benigni");
		filmInfo.put("time", 116);
		filmInfo.put("title", "Life is Beautiful");
		filmList.add(filmInfo);
		
		filmInfo = new HashMap<>();
		filmInfo.put("rate", 12);
		filmInfo.put("director", "Christopher Nolan");
		filmInfo.put("time", 147);
		filmInfo.put("title", "Inception");
		filmList.add(filmInfo);
		
		filmInfo = new HashMap<>();
		filmInfo.put("rate", 19);
		filmInfo.put("director", "Yoon Jong-Bin");
		filmInfo.put("time", 133);
		filmInfo.put("title", "Nameless Gangster: Rules of the Time");
		filmList.add(filmInfo);
		
		filmInfo = new HashMap<>();
		filmInfo.put("rate", 15);
		filmInfo.put("director", "Francis Lawrence");
		filmInfo.put("time", 137);
		filmInfo.put("title", "The Hunger Games");
		filmList.add(filmInfo);
		
		return filmList;
	}
	
	@RequestMapping("/2")
	public List<Blog> classListResponse()
	{
		List<Blog> blogList = new ArrayList<>();
		Blog blog = new Blog("안녕하세요 가입인사 드립니다", "hagulu", "안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		blogList.add(blog);
		blog = new Blog("헐 대박", "bada", "오늘 목요일이었어... 금요일인줄");
		blogList.add(blog);
		blog = new Blog("오늘 데이트 한 얘기 해드릴께요.", "dulumary", "....");
		blogList.add(blog);
		
		return blogList;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<Blog> entityResponse()
	{
		Blog blog = new Blog("안녕하세요 가입인사 드립니다", "hagulu", "안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		ResponseEntity<Blog> entity = new ResponseEntity<Blog>(blog, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
}
