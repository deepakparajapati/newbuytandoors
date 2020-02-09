package com.buytandoors.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {


	@GetMapping("/demo")
	public String productdemo() {
		return "products-tandoors";
	}
}