package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductShapeEntity;

@Repository
public interface ProductShapeRepository extends JpaRepository<ProductShapeEntity, Long> {

}
