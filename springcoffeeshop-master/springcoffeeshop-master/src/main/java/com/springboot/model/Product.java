package com.springboot.model;

import javax.persistence.*;

/**
 * Created by Ramjeet on 22/03/19.
 */

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long productId;

	private String productName;

	private Double productPrice;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

}
