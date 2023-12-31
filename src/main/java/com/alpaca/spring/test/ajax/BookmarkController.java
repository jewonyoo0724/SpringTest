package com.alpaca.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alpaca.spring.test.ajax.domain.Bookmark;
import com.alpaca.spring.test.ajax.service.BookmarkService;

@Controller
@RequestMapping("/ajax/bookmark")
public class BookmarkController {

	@Autowired
	private BookmarkService bookmarkService;
	
	//view page
	@GetMapping("/list")
	public String bookmarkList(Model model)
	{
		List<Bookmark> bookmarkList = bookmarkService.getBookmarkList();
		model.addAttribute("bookmarkList", bookmarkList);
		
		return "ajax/bookmark";
	}
	
	//API
	@PostMapping("/add")
	@ResponseBody
	public Map<String, String> addBookmark(@RequestParam("name") String name, @RequestParam("url") String url)
	{
		int count = bookmarkService.addBookmark(name, url);
		
		Map<String, String> statusMap = new HashMap<>();
		
		if(count == 1)
		{
			statusMap.put("status", "success");
		}
		else
		{
			statusMap.put("status", "fail");
		}
		
		return statusMap;
	}
	
	//view page
	@GetMapping("/input")
	public String bookmarkInput()
	{
		return "ajax/bookmarkinput";
	}
	
	//API
	@PostMapping("/url-confirm")
	@ResponseBody
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url)
	{
		Map<String, Boolean> duplicateMap = new HashMap<>();
		if (bookmarkService.isDuplicateUrl(url))
		{
			duplicateMap.put("isDuplicate", true);
		}
		else
		{
			duplicateMap.put("isDuplicate", false);
		}
		
		return duplicateMap;
	}
	
	@GetMapping("/delete")
	public Map<String, String> deleteBookmark(
			@RequestParam("name") String name, 
			@RequestParam("url") String url)
	{
		Map<String, String> deleteMap = new HashMap<>();
		if (bookmarkService.deleteBookmark(name, url) == 1)
		{
			deleteMap.put("result", "success");
		}
		else
		{
			deleteMap.put("result", "fail");
		}
		
		return deleteMap;
	}
	
	
	
}
