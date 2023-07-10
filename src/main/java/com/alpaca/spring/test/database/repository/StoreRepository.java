package com.alpaca.spring.test.database.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.alpaca.spring.test.database.domain.Store;

@Repository
public interface StoreRepository {

	public List<Store> selectStoreList();
}
