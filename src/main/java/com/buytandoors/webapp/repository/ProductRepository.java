package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
