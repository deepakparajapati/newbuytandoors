package com.buytandoors.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@GetMapping("/view-product-list")
	public String viewProductList() {
		return "view-product-list";
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
