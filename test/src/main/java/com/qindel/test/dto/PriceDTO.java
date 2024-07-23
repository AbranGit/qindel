package com.qindel.test.dto;

import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PriceDTO {
	
	private int brandId;
	private Timestamp fechaAplicacion;
	private int productId;
	private int priceList;
	private Timestamp startDate;
	private Timestamp endDate;
	private double price;
}
