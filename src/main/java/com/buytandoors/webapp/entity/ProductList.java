package com.buytandoors.webapp.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
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
	@Column
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
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "productList_Size")
	@JoinColumns({@JoinColumn(name = "productid"),@JoinColumn(name = "sizeId")})
	private Set<ProductSizeEntity> productSizeEntity;
}
