package com.buytandoors.webapp.model;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class ProductModel{

	public Long productid;
	public String productName;
	public String productDescription;
	public String feature;
	public MultipartFile[] productPicUrl;
	private String modelName;
	private int modelNumber;
	private String applicationsUsage;
	private String fuleConsumptionType;
	private String bodyMaterial;
	private String shape;
	private String brandName;
	private String productSize;
	private String measurementUnit;
	private int length;
	private int width;
	private int height;
	private int mouth;
	private int numberOfWheels;
	private String condition;
	private String capacityPerBread;
	private String certification;
	private String insulation;
	private String operatingTemperature;
	private String keywordMetadata;
	private String usage;
	private String manufacturingCountry;
	private String packing;
	private int grossWeight;
	private int netWeight;
	private String thermometer;
	private String includes;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getApplicationsUsage() {
		return applicationsUsage;
	}
	public void setApplicationsUsage(String applicationsUsage) {
		this.applicationsUsage = applicationsUsage;
	}
	public String getFuleConsumptionType() {
		return fuleConsumptionType;
	}
	public void setFuleConsumptionType(String fuleConsumptionType) {
		this.fuleConsumptionType = fuleConsumptionType;
	}
	public String getBodyMaterial() {
		return bodyMaterial;
	}
	public void setBodyMaterial(String bodyMaterial) {
		this.bodyMaterial = bodyMaterial;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getMeasurementUnit() {
		return measurementUnit;
	}
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getMouth() {
		return mouth;
	}
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getCapacityPerBread() {
		return capacityPerBread;
	}
	public void setCapacityPerBread(String capacityPerBread) {
		this.capacityPerBread = capacityPerBread;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getInsulation() {
		return insulation;
	}
	public void setInsulation(String insulation) {
		this.insulation = insulation;
	}
	public String getOperatingTemperature() {
		return operatingTemperature;
	}
	public void setOperatingTemperature(String operatingTemperature) {
		this.operatingTemperature = operatingTemperature;
	}
	public String getKeywordMetadata() {
		return keywordMetadata;
	}
	public void setKeywordMetadata(String keywordMetadata) {
		this.keywordMetadata = keywordMetadata;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getManufacturingCountry() {
		return manufacturingCountry;
	}
	public void setManufacturingCountry(String manufacturingCountry) {
		this.manufacturingCountry = manufacturingCountry;
	}
	public String getPacking() {
		return packing;
	}
	public void setPacking(String packing) {
		this.packing = packing;
	}
	public int getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(int grossWeight) {
		this.grossWeight = grossWeight;
	}
	public int getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}
	public String getThermometer() {
		return thermometer;
	}
	public void setThermometer(String thermometer) {
		this.thermometer = thermometer;
	}
	public String getIncludes() {
		return includes;
	}
	public void setIncludes(String includes) {
		this.includes = includes;
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
				+ productDescription + ", feature=" + feature + ", productPicUrl=" + Arrays.toString(productPicUrl)
				+ ", modelName=" + modelName + ", modelNumber=" + modelNumber + ", applicationsUsage="
				+ applicationsUsage + ", fuleConsumptionType=" + fuleConsumptionType + ", bodyMaterial=" + bodyMaterial
				+ ", shape=" + shape + ", brandName=" + brandName + ", productSize=" + productSize
				+ ", measurementUnit=" + measurementUnit + ", length=" + length + ", width=" + width + ", height="
				+ height + ", mouth=" + mouth + ", numberOfWheels=" + numberOfWheels + ", condition=" + condition
				+ ", capacityPerBread=" + capacityPerBread + ", certification=" + certification + ", insulation="
				+ insulation + ", operatingTemperature=" + operatingTemperature + ", keywordMetadata=" + keywordMetadata
				+ ", usage=" + usage + ", manufacturingCountry=" + manufacturingCountry + ", packing=" + packing
				+ ", grossWeight=" + grossWeight + ", netWeight=" + netWeight + ", thermometer=" + thermometer
				+ ", includes=" + includes + "]";
	}

}
