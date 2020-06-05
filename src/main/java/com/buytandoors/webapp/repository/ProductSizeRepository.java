package com.buytandoors.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductSizeEntity;

@Repository
public interface ProductSizeRepository extends JpaRepository<ProductSizeEntity, Long> {
	
	@Query(value = "select product_size from product_size_entity", nativeQuery = true)
	public List<String> findSize();
	
	@Query(value = "select size_id from product_size_entity where product_size = :productSize", nativeQuery = true)
	public Long findSizeId(@Param("productSize") String productSize);
	

}
