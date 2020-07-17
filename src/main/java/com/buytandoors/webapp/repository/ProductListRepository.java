package com.buytandoors.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductList;

@Repository
public interface ProductListRepository extends JpaRepository<ProductList, Long> {

//	ProductList addProduct(ProductList productList);
//	ProductList save(ProductList productList);
	   @Query(value = "SELECT * FROM product_list WHERE is_available = 1;", nativeQuery = true)
	   List<ProductList> findAllAvailable();
}
