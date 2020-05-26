package com.buytandoors.webapp.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductModel {

	public Long productid;
	public String productName;
	public String productDescription;
	public String feature;
	public MultipartFile[] productPicUrl;
	private String modelName;
//	private int modelNumber;
	private String[] applicationsUsage;
	private String[] fuleConsumptionType;
	private String bodyMaterial;
	private String shape;
	private String brandName;
	private String[] productSize;
	private String measurementUnit;
	private int numberOfWheels;
	private String useCondition;
//	private String[] capacityPerBread;
	private String certification;
	private String[] insulation;
	private String operatingTemperature;
	private String keywordMetadata;
	private String[] usageArea;
	private String manufacturingCountry;
	private String packing;
//	private int[] grossWeight;
//	private int[] netWeight;
	private String thermometer;
	private String includes;
	private String[] category;

}
