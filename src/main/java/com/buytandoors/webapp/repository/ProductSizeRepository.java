package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductSizeEntity;

@Repository
public interface ProductSizeRepository extends JpaRepository<ProductSizeEntity, Long> {

}
