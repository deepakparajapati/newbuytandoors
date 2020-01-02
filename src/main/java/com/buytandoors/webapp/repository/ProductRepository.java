package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.dao.ProductList;
import com.buytandoors.webapp.modal.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductList, Long> {

	ProductList addProduct(ProductModel productModel);
//	ProductList save(ProductList productList);
//	   @Query(value = "SELECT * FROM country WHERE COUNTRY_ID = :countryId", nativeQuery = true)
//       String findbyCountryId(@Param("countryId") String countryId);
}
