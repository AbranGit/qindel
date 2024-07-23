package com.qindel.test.service.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qindel.test.dto.PriceDTO;
import com.qindel.test.entity.Prices;
import com.qindel.test.repository.PriceRepository;
import com.qindel.test.service.PriceService;
@Service
public class PriceServiceImpl implements PriceService{

	@Autowired
	PriceRepository priceRepository;
	@Override
	public PriceDTO getPriceByDateProductIdAndBrandId(Timestamp aplicationDate, int productId, int brandId) throws Exception {
		
		Prices prices = priceRepository.findByDateBetweenStartDateAndEndDateAndProductIdAndBrandId(aplicationDate, productId, brandId);
		if (prices == null) {
			throw new Exception("No se ha podido recuperar la tarifa solicitada");
		}
		PriceDTO priceDTO = new PriceDTO();
		priceDTO.setBrandId(prices.getBrandId());
		priceDTO.setPriceList(prices.getPriceList());
		priceDTO.setProductId(prices.getProductId());
		priceDTO.setStartDate(prices.getStartDate());
		priceDTO.setEndDate(prices.getEndDate());
		priceDTO.setPrice(prices.getPrice());
	
		return new PriceDTO();
	}
}
