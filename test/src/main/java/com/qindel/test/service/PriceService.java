package com.qindel.test.service;

import java.sql.Timestamp;

import com.qindel.test.dto.PriceDTO;

public interface PriceService {
	
	public PriceDTO getPriceByDateProductIdAndBrandId(Timestamp aplicationDate, 
			int productId, int brandId) throws Exception;
}
