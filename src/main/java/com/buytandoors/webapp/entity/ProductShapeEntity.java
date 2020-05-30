package com.buytandoors.webapp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class ProductShapeEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shapeId;
	@Column
	private String shape;
	
	@ManyToOne(cascade=CascadeType.ALL)  
	private ProductSizeEntity productSizeClassEntity;
	
	@OneToOne(mappedBy="productShapeWeightEntity")
	private ProductWeightEntity weightid;
//	@JoinTable(name = "productShapeWeightEntity")
//	(mappedBy = "productShapeEntity")
}
