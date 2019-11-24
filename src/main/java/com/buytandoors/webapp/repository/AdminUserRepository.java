package com.buytandoors.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buytandoors.webapp.entity.AdminUser;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Long>{

}
