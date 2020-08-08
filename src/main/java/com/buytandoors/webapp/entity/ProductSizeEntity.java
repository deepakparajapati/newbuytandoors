package com.buytandoors.webapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class ProductSizeEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sizeId;
	@Column
	private int productLength;
	@Column
	private int productWidth;
	@Column
	private int productHeight;
	@Column
	private int productMouth;
	@Column
	private String capacityPerBread;
	@Column(unique = true)
	private String productSize;
//	@ManyToMany(mappedBy = "productSizeEntity", cascade = CascadeType.ALL)
//	private Set<ProductList> productList;
	
//	@OneToMany(mappedBy = "productSizeClassEntity", cascade = CascadeType.ALL)
//	private Set<ProductShapeEntity> productShapeEntity;
}
