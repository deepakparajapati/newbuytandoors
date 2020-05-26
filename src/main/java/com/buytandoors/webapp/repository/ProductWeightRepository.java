package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductWeightEntity;

@Repository
public interface ProductWeightRepository extends JpaRepository<ProductWeightEntity, Long> {

}
