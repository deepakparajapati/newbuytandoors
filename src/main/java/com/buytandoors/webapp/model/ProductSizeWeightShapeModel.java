package com.buytandoors.webapp.model;

import lombok.Data;

@Data
public class ProductSizeWeightShapeModel {

	private int grossWeight;
	private int netWeight;
	private int productLength;
	private int productWidth;
	private int productHeight;
	private int productMouth;
	private String shape;
	private String weightName;
	private String capacityPerBread;
	private String productSize;
}
