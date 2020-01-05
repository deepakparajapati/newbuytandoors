package com.buytandoors.webapp.services;

import com.buytandoors.webapp.dao.ProductList;
import com.buytandoors.webapp.modal.ProductModel;

public interface ProductService {

	ProductList addProductProcess(ProductModel productModel);
	
}
