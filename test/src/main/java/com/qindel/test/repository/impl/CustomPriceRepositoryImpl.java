package com.qindel.test.repository.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import com.qindel.test.entity.Prices;
import com.qindel.test.repository.CustomPriceRepository;

public class CustomPriceRepositoryImpl implements CustomPriceRepository{

	@Autowired
	private CustomPriceRepository customPriceRepository;
	
	@Override
	
	public Prices getPriceByDateProductIdAndBrandId(Timestamp aplicationDate, int productId, int brandId) {
		 return customPriceRepository.getPriceByDateProductIdAndBrandId(aplicationDate, productId, brandId);
	}

}
