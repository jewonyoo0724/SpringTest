package com.alpaca.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.spring.test.jsp.domain.Seller;
import com.alpaca.spring.test.jsp.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public int addSeller(String nickname, String image, double temp)
	{
		int count = sellerRepository.insertSeller(nickname, image, temp);
		return count;
	}
	
	public Seller getLastSeller()
	{
		Seller seller = sellerRepository.selectLastSeller();
		return seller;
	}

	public Seller getLastSellerbyId(int id)
	{
		Seller seller = sellerRepository.selectLastSellerbyId(id);
		return seller;
	}
}
