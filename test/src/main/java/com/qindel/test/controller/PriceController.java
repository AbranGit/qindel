package com.qindel.test.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qindel.test.dto.PriceDTO;
import com.qindel.test.service.PriceService;
@RestController
@RequestMapping("/prices")
public class PriceController {
	
	@Autowired
	PriceService priceService;
	
	@GetMapping("/getprice")
	public ResponseEntity<PriceDTO> getPriceByDateProductIdAndBrandId(@RequestParam("applicationDate") Timestamp aplicationDate, 
			@RequestParam("productId") int productId, @RequestParam("brandId") int brandId) throws Exception {
		PriceDTO priceDTO = priceService.getPriceByDateProductIdAndBrandId(aplicationDate, productId, brandId);
		return new ResponseEntity<PriceDTO>(priceDTO, HttpStatus.OK);
		
	}

}
