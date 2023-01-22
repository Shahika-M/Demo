package com.example.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	
	@Id
	private int id;
	@Column 
	private String productName;
	@Column
	private String productCost;
	@Column
	private String online;
	@Column 
	private String category;
	
	public Product() {
		super();
		
	}

	public Product(int id, String productName, String productCost, String online, String category) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCost = productCost;
		this.online = online;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCost() {
		return productCost;
	}

	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}

	public String getOnline() {
		return online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
