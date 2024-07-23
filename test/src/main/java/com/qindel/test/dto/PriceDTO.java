package com.qindel.test.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PriceDTO {
	
	private int brandId;
	private int productId;
	private Long priceList;
	private String startDate;
	private String endDate;
	private double price;
}
