package com.alpaca.spring.test.jsp.repository;

import org.springframework.stereotype.Repository;

import com.alpaca.spring.test.jsp.domain.Realtor;

@Repository
public interface RealtorRepository {
	
	public int insertRealtor(Realtor realtor);

}
