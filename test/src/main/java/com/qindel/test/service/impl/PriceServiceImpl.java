package com.qindel.test.service.impl;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qindel.test.dto.PriceDTO;
import com.qindel.test.entity.Price;
import com.qindel.test.repository.PriceRepository;
import com.qindel.test.service.PriceService;
@Service
public class PriceServiceImpl implements PriceService{
	private static final Logger log = LoggerFactory.getLogger(PriceServiceImpl.class);

	@Autowired
	PriceRepository priceRepository;
	@Override
	public PriceDTO getPriceByDateProductIdAndBrandId(LocalDateTime aplicationDate, int productId, int brandId) throws Exception {
		log.info("INICIO - PriceServiceImpl - getPriceByDateProductIdAndBrandId()");
		Price price = priceRepository.findPrice(aplicationDate, productId, brandId);
		if (price == null) {
			log.error("No se ha podido recuperar la tarifa solicitada");
			throw new Exception("No se ha podido recuperar la tarifa solicitada");
		}
		 
		PriceDTO priceDTO = new PriceDTO();
		priceDTO.setBrandId(price.getBrandId());
		priceDTO.setPriceList(price.getPriceList());
		priceDTO.setProductId(price.getProductId());
		priceDTO.setStartDate(price.getStartDate().toString());
		priceDTO.setEndDate(price.getEndDate().toString());
		priceDTO.setPrice(price.getPrice());
		
		log.info("FIN - PriceServiceImpl - getPriceByDateProductIdAndBrandId()");
	
		return priceDTO;
	}
}
