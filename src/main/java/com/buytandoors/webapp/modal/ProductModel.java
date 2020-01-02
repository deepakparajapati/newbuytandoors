package com.buytandoors.webapp.modal;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class ProductModel {

	public Long productid;
	public String productName;
	public String productDescription;
	public String productSize;
	public String feature;
	public MultipartFile[] productPicUrl;
	
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
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public MultipartFile[] getProductPicUrl() {
		return productPicUrl;
	}
	public void setProductPicUrl(MultipartFile[] productPicUrl) {
		this.productPicUrl = productPicUrl;
	}
	@Override
	public String toString() {
		return "ProductModel [productid=" + productid + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productSize=" + productSize + ", feature=" + feature + ", productPicUrl="
				+ Arrays.toString(productPicUrl) + "]";
	}
	
}
