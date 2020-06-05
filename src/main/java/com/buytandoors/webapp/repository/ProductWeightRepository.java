package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductWeightEntity;

@Repository
public interface ProductWeightRepository extends JpaRepository<ProductWeightEntity, Long> {
	
	
	@Query(value = "select weightid from product_weight_entity WHERE shape = :shape AND size_id = :sizeId", nativeQuery = true)
	public Long findWeightId(@Param("shape") String shape, @Param("sizeId") long sizeId);

}
