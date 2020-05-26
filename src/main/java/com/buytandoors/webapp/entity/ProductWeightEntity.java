package com.buytandoors.webapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class ProductWeightEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long weightid;
	@Column
	private int grossWeight;
	@Column
	private int netWeight;
	@Column
	private String shape;
	@ManyToOne
	@JoinColumn(name = "shapeId")
	private ProductShapeEntity productShapeEntity;
}
