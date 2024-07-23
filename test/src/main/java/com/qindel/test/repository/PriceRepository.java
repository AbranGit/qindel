package com.qindel.test.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.qindel.test.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Long>{

	@Query("SELECT p FROM Price p WHERE :applicationDate BETWEEN p.startDate AND p.endDate AND p.productId = :productId AND p.brandId = :brandId ORDER BY p.priority DESC LIMIT 1")
    Price findPrice(
            @Param("applicationDate") LocalDateTime applicationDate,
            @Param("productId") int productId,
            @Param("brandId") int brandId
    );

}
