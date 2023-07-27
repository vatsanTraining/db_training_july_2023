package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

@Component
public class Invoice {

	@Autowired
	private Customer customer;
	
	@Autowired
	private List<Product> products;
	
//	@Autowired
//	public Invoice(Customer customer, Product product) {
//		super();
//		this.customer = customer;
//		this.product = product;
//	}
	
//	@Autowired
//	public void setProducts(List<Product> products) {
//		
//		this.products = products;
//	}
	
	
	
}
