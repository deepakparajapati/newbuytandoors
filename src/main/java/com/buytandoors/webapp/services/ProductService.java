package com.buytandoors.webapp.services;

import com.buytandoors.webapp.entity.ProductList;
import com.buytandoors.webapp.entity.ProductWeightEntity;
import com.buytandoors.webapp.model.ProductModel;
import com.buytandoors.webapp.model.ProductSizeWeightShapeModel;

public interface ProductService {

	ProductList addProductProcess(ProductModel productModel);

	ProductModel productToProductModel(ProductList product);
	
	ProductWeightEntity addCustomSizeWeight(ProductSizeWeightShapeModel productSizeWeightShapeModel) throws Exception;

}
