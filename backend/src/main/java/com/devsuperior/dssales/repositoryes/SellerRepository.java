package com.devsuperior.dssales.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dssales.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
