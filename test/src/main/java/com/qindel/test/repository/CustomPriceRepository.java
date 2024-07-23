package com.qindel.test.repository;

import java.sql.Timestamp;

import com.qindel.test.entity.Prices;

public interface CustomPriceRepository {
	
	public Prices getPriceByDateProductIdAndBrandId(Timestamp aplicationDate, int productId, int brandId);
}
