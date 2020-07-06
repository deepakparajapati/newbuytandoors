package com.buytandoors.webapp.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductModel {

	public Long productid;
	@NotNull
	public String productName;
	@NotEmpty
	public String productDescription;
	@NotEmpty
	public String feature;
	public MultipartFile[] productPicUrl;
	public MultipartFile productSpecificationImage;
	private String modelName;
//	private int modelNumber;
	@NotEmpty
	private String[] applicationsUsage;
	@NotEmpty
	private String[] fuleConsumptionType;
	@NotEmpty
	private String bodyMaterial;
	@NotEmpty
	private String shape;
	@NotEmpty
	private String brandName;
	@NotEmpty
	private String[] productSize;
	@NotEmpty
	private String measurementUnit;
	private int numberOfWheels;
	@NotEmpty
	private String useCondition;
//	private String[] capacityPerBread;
	private String certification;
	private String[] insulation;
	private String operatingTemperature;
	private String operatingOutsideTemperature;
	private String keywordMetadata;
	private String[] usageArea;
	private String manufacturingCountry;
	private String packing;
//	private int[] grossWeight;
//	private int[] netWeight;
	private String thermometer;
	private String includes;
	private String productTopCategory;
	private String[] productCategory;
	private Integer isAvailable;
}
