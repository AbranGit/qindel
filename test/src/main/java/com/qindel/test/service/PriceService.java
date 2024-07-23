package com.qindel.test.service;

import java.time.LocalDateTime;

import com.qindel.test.dto.PriceDTO;

public interface PriceService {
	
	public PriceDTO getPriceByDateProductIdAndBrandId(LocalDateTime aplicationDate, 
			int productId, int brandId) throws Exception;
}
