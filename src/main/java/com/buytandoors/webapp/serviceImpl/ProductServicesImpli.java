package com.buytandoors.webapp.serviceImpl;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.buytandoors.webapp.dao.ProductList;
import com.buytandoors.webapp.modal.ProductModel;
import com.buytandoors.webapp.repository.ProductRepository;
import com.buytandoors.webapp.services.ProductService;

public class ProductServicesImpli implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public ProductList addProduct(ProductModel productModel) throws IllegalStateException {
		ProductList pl = new ProductList();
		pl.setFeature(productModel.getFeature());
		pl.setProductDescription(productModel.getProductDescription());
		pl.setProductName(productModel.getProductName());
		File file = new File("src\\main\\resources\\static", "productimages");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}
		int i = 0;
		String urls = "";
		for (MultipartFile iterable_element : productModel.getProductPicUrl()) {
			String filePath = file.getAbsolutePath() + "\\" + productModel.getProductPicUrl()[i].getOriginalFilename();
			try {
				productModel.getProductPicUrl()[i].transferTo(new File(filePath));
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (i == 0)
				urls = iterable_element.getOriginalFilename();
			else
				urls += "," + iterable_element.getOriginalFilename();

			i++;
		}
		pl.setProductPicUrl(urls);
		ProductList product = productRepository.save(pl);
		return product;
	}

}
