package com.devsuperior.dssales.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_sellers")
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();

	public Seller() {
	}

	public Seller(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Seller(Long id, String name, List<Sale> sales) {
		super();
		this.id = id;
		this.name = name;
		this.sales = sales;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales(List<Sale> sales) {
		this.sales = sales;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, sales);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(sales, other.sales);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", sales=" + sales + "]";
	}

}
