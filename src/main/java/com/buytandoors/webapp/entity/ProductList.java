package com.buytandoors.webapp.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class ProductList implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5668360308108665832L;
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
	private MultipartFile[] productPicUrl;

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

	public MultipartFile[] getProductPicUrl() {
		return productPicUrl;
	}

	public void setProductPicUrl(MultipartFile[] productPicUrl) {
		this.productPicUrl = productPicUrl;
	}

	@Override
	public String toString() {
		return "ProductList [productid=" + productid + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productSize=" + productSize + ", feature=" + feature + ", productPicUrl="
				+ Arrays.toString(productPicUrl) + "]";
	}

}
