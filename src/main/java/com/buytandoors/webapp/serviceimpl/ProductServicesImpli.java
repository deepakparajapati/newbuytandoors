package com.buytandoors.webapp.serviceimpl;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.buytandoors.webapp.entity.Product;
import com.buytandoors.webapp.entity.ProductList;
import com.buytandoors.webapp.entity.ProductSizeEntity;
import com.buytandoors.webapp.entity.ProductWeightEntity;
import com.buytandoors.webapp.model.ProductModel;
import com.buytandoors.webapp.model.ProductSizeWeightShapeModel;
import com.buytandoors.webapp.repository.ProductListRepository;
import com.buytandoors.webapp.repository.ProductRepository;
import com.buytandoors.webapp.repository.ProductShapeRepository;
import com.buytandoors.webapp.repository.ProductSizeRepository;
import com.buytandoors.webapp.repository.ProductWeightRepository;
import com.buytandoors.webapp.services.ProductService;

@Service
public class ProductServicesImpli implements ProductService {

	@Autowired
	ProductListRepository productListRepository;
	@Autowired
	ProductSizeRepository productSizeRepository;
	@Autowired
	ProductShapeRepository productShapeRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductWeightRepository productWeightRepository;

	@Override
	public ProductList addProductProcess(ProductModel productModel){
		ProductList pl = new ProductList();
		try {
		String uploadDir = System.getProperty("user.dir");
		System.out.println(uploadDir);
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
		pl.setProductTopCategory(productModel.getProductTopCategory());
		if (productModel.getProductid() == null || productModel.getProductid() == 0) {
			pl.setIsAvailable(1);
			File file = new File(uploadDir, "productimages");
			if (!file.exists()) {
				if (file.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
				}
			}

			String dirName = productModel.getProductName().replace(" ", "-");
			File subImageFolder = new File(uploadDir + "/productimages", dirName);

			if (!subImageFolder.exists()) {
				if (subImageFolder.mkdir()) {
					System.out.println("subImageFolder Directory is created!");
				} else {
					System.out.println("Failed to create subImageFolder directory!");
				}
			}
			int i = 0;
			String urls = "";
			for (MultipartFile iterable_element : productModel.getProductPicUrl()) {
				String filePath = subImageFolder.getAbsolutePath() + "/"
						+ productModel.getProductPicUrl()[i].getOriginalFilename();
				try {
					productModel.getProductPicUrl()[i].transferTo(new File(filePath));
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (i == 0)
					urls = dirName + "/" + iterable_element.getOriginalFilename();
				else
					urls += "," + dirName + "/" + iterable_element.getOriginalFilename();

				i++;
			}
			pl.setProductPicUrl(urls);

		
			if (!productModel.getProductSpecificationImage().isEmpty()) {
				// specification image
				File productspecimages = new File(uploadDir, "productspecimages");
				if (!productspecimages.exists()) {
					if (productspecimages.mkdir()) {
						System.out.println("Directory productspecimages is created!");
					} else {
						System.out.println("Failed to productspecimages create directory!");
					}
				}
				String filePath = productspecimages.getAbsolutePath() + "/"
						+ productModel.getProductSpecificationImage().getOriginalFilename();
				try {
					productModel.getProductSpecificationImage().transferTo(new File(filePath));
				} catch (IOException e) {
					e.printStackTrace();
				}

				pl.setProductSpecificationImage(productModel.getProductSpecificationImage().getOriginalFilename());
			}
		} else {
			ProductList oldProduct = productListRepository.getOne(productModel.productid);
			System.out.println(oldProduct.toString());
			pl.setProductPicUrl(oldProduct.getProductPicUrl());
			pl.setProductSpecificationImage(oldProduct.getProductSpecificationImage());
			pl.setProductid(productModel.productid);
			pl.setIsAvailable(productModel.getIsAvailable());
		}
		System.out.println(pl);
		pl = productListRepository.save(pl);

		// setting shape id
		Long shapeId = productShapeRepository.findShapeId(productModel.getShape());

		for (String size : productModel.getProductSize()) {
			long sizeId = productSizeRepository.findSizeId(size);
			long weightId = productWeightRepository.findWeightId(productModel.getShape(), sizeId);
			Product product = new Product();
			product.setShapeId(shapeId);
			product.setProductid(pl.getProductid());
			product.setSizeId(sizeId);
			product.setWeightId(weightId);
			productRepository.save(product);
		}

		}catch(Exception e) {System.out.println(e);}
		return pl;
	}

	@Override
	public ProductModel productToProductModel(ProductList product) {
		ProductModel pl = new ProductModel();
		pl.setProductid(product.getProductid());
		pl.setApplicationsUsage(product.getApplicationsUsage().split(","));
		pl.setFuleConsumptionType(product.getFuleConsumptionType().split(","));
		pl.setModelName(product.getModelName());
		pl.setShape(product.getShape());
		pl.setBodyMaterial(product.getBodyMaterial());
		pl.setBrandName(product.getBrandName());
		pl.setProductSize(product.getProductSize().split(","));
		pl.setMeasurementUnit(product.getMeasurementUnit());
		pl.setNumberOfWheels(product.getNumberOfWheels());
		pl.setUseCondition(product.getUseCondition());
		pl.setCertification(product.getCertification());
		pl.setInsulation(product.getInsulation().split(","));
		pl.setOperatingTemperature(product.getOperatingTemperature());
		pl.setOperatingOutsideTemperature(product.getOperatingOutsideTemperature());
		pl.setKeywordMetadata(product.getKeywordMetadata());
		pl.setUsageArea(product.getUsageArea().split(","));
		pl.setManufacturingCountry(product.getManufacturingCountry());
		pl.setPacking(product.getPacking());
		pl.setThermometer(product.getThermometer());
		pl.setIncludes(product.getIncludes());
		pl.setProductCategory(product.getProductCategory().split(","));
		pl.setFeature(product.getFeature());
		pl.setProductDescription(product.getProductDescription());
		pl.setProductName(product.getProductName());
		pl.setProductTopCategory(product.getProductTopCategory());
		pl.setIsAvailable(product.getIsAvailable());
		return pl;
	}

	@Override
	public ProductWeightEntity addCustomSizeWeight(ProductSizeWeightShapeModel productSizeWeightShapeModel)
			throws Exception {

		ProductSizeEntity productSizeEntity = new ProductSizeEntity();
		productSizeEntity.setProductHeight(productSizeWeightShapeModel.getProductHeight());
		productSizeEntity.setCapacityPerBread(productSizeWeightShapeModel.getCapacityPerBread());
		productSizeEntity.setProductLength(productSizeWeightShapeModel.getProductLength());
		productSizeEntity.setProductMouth(productSizeWeightShapeModel.getProductMouth());
		productSizeEntity.setProductSize(productSizeWeightShapeModel.getProductSize());
		productSizeEntity.setProductWidth(productSizeWeightShapeModel.getProductWidth());
		if (productSizeRepository.findSizeId(productSizeWeightShapeModel.getProductSize()) == null) {
			productSizeEntity = productSizeRepository.save(productSizeEntity);
			ProductWeightEntity productWeightEntity = new ProductWeightEntity();
			productWeightEntity.setGrossWeight(productSizeWeightShapeModel.getGrossWeight());
			productWeightEntity.setNetWeight(productSizeWeightShapeModel.getNetWeight());
			productWeightEntity.setShape(productSizeWeightShapeModel.getShape());
			productWeightEntity.setWeightName(productSizeWeightShapeModel.getWeightName());
			productWeightEntity.setSizeId(productSizeEntity.getSizeId());
			productWeightEntity = productWeightRepository.save(productWeightEntity);
			return productWeightEntity;
		} else {
			throw new Exception("Product size name already exist.");
		}
	}

}
