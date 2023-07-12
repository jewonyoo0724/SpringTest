package com.alpaca.spring.test.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.alpaca.spring.test.jsp.domain.Seller;

@Repository
public interface SellerRepository {
	
	public int insertSeller(@Param("nickname") String nickname, @Param("image") String image, @Param("temp") double temperature);

	public Seller selectLastSeller();
	
	public Seller selectLastSellerbyId(@Param("id") int id);
}
