package com.buytandoors.webapp.serviceimpl;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.buytandoors.webapp.entity.ProductList;
import com.buytandoors.webapp.model.ProductModel;
import com.buytandoors.webapp.repository.ProductRepository;
import com.buytandoors.webapp.repository.ProductShapeRepository;
import com.buytandoors.webapp.repository.ProductSizeRepository;
import com.buytandoors.webapp.repository.ProductWeightRepository;
import com.buytandoors.webapp.services.ProductService;

@Service
public class ProductServicesImpli implements ProductService {

	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductSizeRepository productSizeRepository;
	@Autowired
	ProductShapeRepository productShapeRepository; 
	@Autowired
	ProductWeightRepository productWeightRepository; 

	@Override
	public ProductList addProductProcess(ProductModel productModel) throws IllegalStateException {
		ProductList pl = new ProductList();
		pl.setApplicationsUsage(String.join(",", productModel.getApplicationsUsage()));
		pl.setFuleConsumptionType(String.join(",", productModel.getFuleConsumptionType()));
		pl.setModelName(productModel.getModelName());
		pl.setShape(productModel.getShape());
		pl.setBodyMaterial(productModel.getBodyMaterial());
		pl.setBrandName(productModel.getBrandName());
		pl.setProductSize(String.join(",", productModel.getProductSize()));
		pl.setMeasurementUnit(productModel.getMeasurementUnit());
		pl.setNumberOfWheels(productModel.getNumberOfWheels());
		pl.setUseCondition(productModel.getUseCondition());
		pl.setCertification(productModel.getCertification());
		pl.setInsulation(String.join(",", productModel.getInsulation()));
		pl.setOperatingTemperature(productModel.getOperatingTemperature());
		pl.setOperatingOutsideTemperature(productModel.getOperatingOutsideTemperature());
		pl.setKeywordMetadata(productModel.getKeywordMetadata());
		pl.setUsageArea(String.join(",", productModel.getUsageArea()));
		pl.setManufacturingCountry(productModel.getManufacturingCountry());
		pl.setPacking(productModel.getPacking());
		pl.setThermometer(productModel.getThermometer());
		pl.setIncludes(productModel.getIncludes());
		pl.setProductCategory(String.join(",", productModel.getProductCategory()));
		
		
		
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
		return productRepository.save(pl);
	}

}
