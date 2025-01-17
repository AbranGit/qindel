package com.qindel.test.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "PRICE")
public class Price {
	@Column(name = "BRAND_ID", nullable = false)
	private int brandId;
	@Column(name = "START_DATE", nullable = false)
	private LocalDateTime startDate;
	@Column(name = "END_DATE", nullable = false)
	private LocalDateTime endDate;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRICE_LIST", nullable = false)
	private Long priceList;
	@Column(name = "PRODUCT_ID", nullable = false)
	private int productId;
	@Column(name = "PRIORITY", nullable = false)
	private int priority;
	@Column(name = "PRICE", nullable = false)
	private double price;
	@Column(name = "CURRENCY", nullable = false)
	private String currency;
}
