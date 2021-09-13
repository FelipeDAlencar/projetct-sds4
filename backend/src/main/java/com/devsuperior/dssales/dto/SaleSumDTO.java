package com.devsuperior.dssales.dto;

import java.io.Serializable;

import com.devsuperior.dssales.entities.Seller;

public class SaleSumDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SaleSumDTO(Seller seller,Double sum) {
		this.sum = sum;
		this.sellerName = seller.getName();
	}
	
	
	
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
}
