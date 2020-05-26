package com.buytandoors.webapp.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@ManyToOne
	@JoinTable(name = "productSizeEntity")
	private ProductSizeEntity productSizeEntity;
	
	@OneToMany(mappedBy = "productShapeEntity")
	private Set<ProductWeightEntity> weightid;
}
