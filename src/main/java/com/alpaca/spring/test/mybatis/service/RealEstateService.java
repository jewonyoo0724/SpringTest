package com.alpaca.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.spring.test.mybatis.domain.RealEstate;
import com.alpaca.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {

	@Autowired
	private RealEstateRepository realEstateRepository;
	
	public RealEstate getRealEstateId(int id)
	{
		RealEstate realEstate = realEstateRepository.selectRealEstateId(id);
		
		return realEstate;
	}
	
	public List<RealEstate> getRealEstateRent(int rent)
	{
		List<RealEstate> realEstate = realEstateRepository.selectRealEstateRent(rent);
		
		return realEstate;
	}
	
	public List<RealEstate> getRealEstateAreaPrice(int area, int price)
	{
		List<RealEstate> realEstate = realEstateRepository.selectRealEstateAreaPrice(area, price);
		
		return realEstate;
	}
	
	public int addRealEstateAsObject(RealEstate realEstate)
	{
		int count = realEstateRepository.insertRealEstateAsObject(realEstate);
				
		return count;
	}
	
	public int addRealEstateAsField(int realtorId, String address, int area, String type, int price, int rentPrice)
	{
		int count = realEstateRepository.insertRealEstateAsField(realtorId, address, area, type, price, rentPrice);
		return count;
	}
}

