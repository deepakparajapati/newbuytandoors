package com.buytandoors.webapp.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	@Column
	private String productName;
	@Column
	private String productDescription;
	@Column
	private String productSize;
	@Column
	private String feature;
	@Column
	private ArrayList<String> productPicUrl;

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ArrayList<String> getProductPicUrl() {
		return productPicUrl;
	}

	public void setProductPicUrl(ArrayList<String> productPicUrl) {
		this.productPicUrl = productPicUrl;
	}

	@Override
	public String toString() {
		return "ProductList [productid=" + productid + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productSize=" + productSize + ", feature=" + feature + ", productPicUrl="
				+ productPicUrl + "]";
	}

}
