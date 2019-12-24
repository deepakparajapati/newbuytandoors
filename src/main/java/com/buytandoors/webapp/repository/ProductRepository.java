package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.ProductList;

@Repository
public interface ProductRepository extends JpaRepository<ProductList, Long> {

//	ProductList save(ProductList productList);
//	   @Query(value = "SELECT * FROM country WHERE COUNTRY_ID = :countryId", nativeQuery = true)
//       String findbyCountryId(@Param("countryId") String countryId);
}
