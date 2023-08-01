package com.alpaca.spring.test.ajax.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.alpaca.spring.test.ajax.domain.Bookmark;

@Repository
public interface BookmarkRepository {

	public List<Bookmark> selectBookmarkList();
	
	public int insertBookMark(@Param("name") String name, @Param("url") String url);
	
	public int selectCountUrl(@Param("url") String url);
	
	public int deleteBookmark(@Param("name") String name, @Param("url") String url);
}
