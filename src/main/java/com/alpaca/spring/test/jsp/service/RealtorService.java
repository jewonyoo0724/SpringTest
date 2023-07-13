package com.alpaca.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpaca.spring.test.jsp.domain.Realtor;
import com.alpaca.spring.test.jsp.repository.RealtorRepository;

@Service
public class RealtorService {
	
	@Autowired
	private RealtorRepository realtorRepository;

	public int addRealtor(Realtor realtor)
	{
		int count = realtorRepository.insertRealtor(realtor);
		return count;
	}
}
