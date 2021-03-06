package com.devsuperior.dssales.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dssales.dto.SaleDTO;
import com.devsuperior.dssales.dto.SaleSuccessDTO;
import com.devsuperior.dssales.dto.SaleSumDTO;
import com.devsuperior.dssales.entities.Sale;
import com.devsuperior.dssales.repositoryes.SaleRepository;
import com.devsuperior.dssales.repositoryes.SellerRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public  List<SaleSumDTO> amountGroupedBySeller(){
		
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public  List<SaleSuccessDTO> successGroupedBySeller(){
		
		return repository.successGroupedBySeller();
	}
}
