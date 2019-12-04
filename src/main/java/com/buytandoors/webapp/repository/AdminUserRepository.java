package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.AdminUser;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
	AdminUser findByUsername(String username);
	
//	   @Query(value = "SELECT * FROM country WHERE COUNTRY_ID = :countryId", nativeQuery = true)
//       String findbyCountryId(@Param("countryId") String countryId);
}
