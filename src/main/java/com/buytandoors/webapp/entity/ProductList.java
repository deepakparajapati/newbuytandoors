package com.buytandoors.webapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Entity
@Table
@Data
@DynamicUpdate
public class ProductList implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	@Column(unique = true)
	private String productName;
	@Column(columnDefinition="TEXT")
	private String productDescription;
	@Column(columnDefinition="TEXT")
	private String feature;
	@Column
	private String productPicUrl;
	@Column
	private String productSpecificationImage;
	@Column
	private String modelName;
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
	private int numberOfWheels;
	@Column
	private String useCondition;
	@Column
	private String certification;
	@Column(columnDefinition="TEXT")
	private String insulation;
	@Column
	private String operatingTemperature;
	@Column
	private String operatingOutsideTemperature;
	@Column
	private String keywordMetadata;
	@Column
	private String usageArea;
	@Column
	private String manufacturingCountry;
	@Column
	private String packing;
	@Column
	private String thermometer;
	@Column
	private String includes;
	@Column
	private String productCategory;
	@Column
	private String productTopCategory;
	@Column(columnDefinition = "integer default 1")
	private Integer isAvailable;
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "productList_Size")
//	@JoinColumns({@JoinColumn(name = "productid"),@JoinColumn(name = "sizeId")})
//	private Set<ProductSizeEntity> productSizeEntity;
}
