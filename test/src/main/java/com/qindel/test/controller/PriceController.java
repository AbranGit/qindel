package com.qindel.test.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qindel.test.dto.PriceDTO;
import com.qindel.test.service.PriceService;
@RestController
@RequestMapping(path = "/prices")
public class PriceController {
	private static final Logger log = LoggerFactory.getLogger(PriceController.class);
	@Autowired
	PriceService priceService;
	
	@GetMapping("/price")
	public ResponseEntity<PriceDTO> getPriceByDateProductIdAndBrandId(@RequestParam("applicationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate, 
			@RequestParam("productId") int productId, @RequestParam("brandId") int brandId) throws Exception {
		log.info("INICIO - PriceController - getPriceByDateProductIdAndBrandId()");
		PriceDTO priceDTO = priceService.getPriceByDateProductIdAndBrandId(applicationDate, productId, brandId);
		log.info("FIN - PriceController - getPriceByDateProductIdAndBrandId()");
		
		return new ResponseEntity<>(priceDTO, HttpStatus.OK);
		
	}

}
