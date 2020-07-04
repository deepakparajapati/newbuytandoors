package com.buytandoors.webapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.buytandoors.webapp.entity.ProductList;
import com.buytandoors.webapp.repository.ProductListRepository;
import com.buytandoors.webapp.repository.ProductShapeRepository;
import com.buytandoors.webapp.repository.ProductSizeRepository;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductListRepository productListRepository;
	
	@Autowired
	ProductSizeRepository productSizeRepository;
	
	@Autowired
	ProductShapeRepository productShapeRepository;
	
	@GetMapping("/view-product/{productId}")
	public ModelAndView viewProductList(@PathVariable Long productId, ModelAndView model) {
		ProductList product = productListRepository.getOne(productId);
		model.setViewName("view-product");
		//map  product to productModel
		model.addObject("productModel", product);
		
		List<String> listofbodymaterial = Arrays.asList("Clay", "Stainless Steel", "Mild Steel", "Copper", "Brass",
				"Other");
		List<String> listofProductTopCategory = Arrays.asList("tandoor", "pizza_ovens", "accessories");
		List<String> listofsize = productSizeRepository.findSize();
		List<String> listofbodyshapes = productShapeRepository.findShapes();
		model.addObject("listofbodyshapes", listofbodyshapes);
		model.addObject("listofbodymaterial", listofbodymaterial);
		model.addObject("listofsize", listofsize);
		model.addObject("listofProductTopCategory", listofProductTopCategory);
		
		System.err.println(product); 	
		return model;
	}

	@GetMapping("/demo")
	public String productdemo() {
		return "products-tandoors";
	}

	@GetMapping("/{productName}")
	public String producttest(@PathVariable String productName, Model model) {
		model.addAttribute("productName", productName);
		return "products-test";
	}
	
	@GetMapping("product/{productsPage}")
	public String productsPage(@PathVariable String productsPage, Model model) {
		model.addAttribute("productName", productsPage);
		return "products-page";
	}
	
}
