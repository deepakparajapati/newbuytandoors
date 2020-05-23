package com.buytandoors.webapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductList implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	@Column
	private String productName;
	@Column
	private String productDescription;
	@Column
	private String feature;
	@Column
	private String productPicUrl;
	@Column
	private String modelName;
	@Column
	private int modelNumber;
	@Column
	private String applicationsUsage;
	@Column
	private String fuleConsumptionType;
	@Column
	private String bodyMaterial;
	@Column
	private String shape;
	@Column
	private String brandName;
	@Column
	private String productSize;
	@Column
	private String measurementUnit;
	@Column
	private int length;
	@Column
	private int width;
	@Column
	private int height;
	@Column
	private int mouth;
	@Column
	private int numberOfWheels;
	@Column
	private String condition;
	@Column
	private String capacityPerBread;
	@Column
	private String certification;
	@Column
	private String insulation;
	@Column
	private String operatingTemperature;
	@Column
	private String keywordMetadata;
	@Column
	private String usage;
	@Column
	private String manufacturingCountry;
	@Column
	private String packing;
	@Column
	private int grossWeight;
	@Column
	private int netWeight;
	@Column
	private String thermometer;
	@Column
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

	public String getProductPicUrl() {
		return productPicUrl;
	}

	public void setProductPicUrl(String productPicUrl) {
		this.productPicUrl = productPicUrl;
	}

	@Override
	public String toString() {
		return "ProductList [productid=" + productid + ", productName=" + productName + ", productDescription="
				+ productDescription + ", feature=" + feature + ", productPicUrl=" + productPicUrl + ", modelName="
				+ modelName + ", modelNumber=" + modelNumber + ", applicationsUsage=" + applicationsUsage
				+ ", fuleConsumptionType=" + fuleConsumptionType + ", bodyMaterial=" + bodyMaterial + ", shape=" + shape
				+ ", brandName=" + brandName + ", productSize=" + productSize + ", measurementUnit=" + measurementUnit
				+ ", length=" + length + ", width=" + width + ", height=" + height + ", mouth=" + mouth
				+ ", numberOfWheels=" + numberOfWheels + ", condition=" + condition + ", capacityPerBread="
				+ capacityPerBread + ", certification=" + certification + ", insulation=" + insulation
				+ ", operatingTemperature=" + operatingTemperature + ", keywordMetadata=" + keywordMetadata + ", usage="
				+ usage + ", manufacturingCountry=" + manufacturingCountry + ", packing=" + packing + ", grossWeight="
				+ grossWeight + ", netWeight=" + netWeight + ", thermometer=" + thermometer + ", includes=" + includes
				+ "]";
	}

}
