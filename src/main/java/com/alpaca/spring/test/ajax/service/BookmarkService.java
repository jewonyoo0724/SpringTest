package com.alpaca.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.spring.test.ajax.domain.Bookmark;
import com.alpaca.spring.test.ajax.repository.BookmarkRepository;

@Service
public class BookmarkService {

	@Autowired
	private BookmarkRepository bookmarkRepository;
	
	public List<Bookmark> getBookmarkList()
	{
		List<Bookmark> bookmarkList = bookmarkRepository.selectBookmarkList();
		
		return bookmarkList;
	}
	
	public int addBookmark(String name, String url)
	{
		int count = bookmarkRepository.insertBookMark(name, url);
		return count;
	}
	
	public boolean isDuplicateUrl(String url)
	{
		
		if (bookmarkRepository.selectCountUrl(url) == 0)
		{
			return false;
		}
		
		return true;
	}
	
	public int deleteBookmark(String name, String url)
	{
		int count = bookmarkRepository.deleteBookmark(name, url);
		
		return count;
	}
	
}
