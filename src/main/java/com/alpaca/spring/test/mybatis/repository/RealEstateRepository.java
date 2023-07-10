package com.alpaca.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.alpaca.spring.test.mybatis.domain.RealEstate;

@Repository
public interface RealEstateRepository 
{
	public RealEstate selectRealEstateId(@Param("id") int id);

	public List<RealEstate> selectRealEstateRent(@Param("rent") int rent);
	
	public List<RealEstate> selectRealEstateAreaPrice(@Param("area") int area, @Param("price") int price);
	
	public int insertRealEstateAsObject(RealEstate realEstate);
	
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId,
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") int rentPrice);

}