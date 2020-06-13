package com.buytandoors.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductShapeEntity;

@Repository
public interface ProductShapeRepository extends JpaRepository<ProductShapeEntity, Long> {
	
	@Query(value = "select shape_id from product_shape_entity WHERE shape = :shape", nativeQuery = true)
	public Long findShapeId(@Param("shape") String shape);
	
	@Query(value = "select shape from product_shape_entity", nativeQuery = true)
	public List<String> findShapes();
	

}
