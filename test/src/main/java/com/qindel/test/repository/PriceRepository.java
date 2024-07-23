package com.qindel.test.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qindel.test.entity.Prices;

public interface PriceRepository extends JpaRepository<Prices, Integer>, CustomPriceRepository{

	public Prices findByDateBetweenStartDateAndEndDateAndProductIdAndBrandId(Timestamp aplicationDate, int productId, int brandId);

}
