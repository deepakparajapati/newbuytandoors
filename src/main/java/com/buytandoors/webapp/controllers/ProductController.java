package com.buytandoors.webapp.controllers;

import java.io.File;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.buytandoors.webapp.entity.AdminUser;
import com.buytandoors.webapp.entity.ProductList;
import com.buytandoors.webapp.model.ProductModel;
import com.buytandoors.webapp.repository.AdminUserRepository;
import com.buytandoors.webapp.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	@Autowired
	AdminUserRepository adminUserRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView error() {
		return new ModelAndView("error");
	}

	// SPRING SECURITY

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView auth(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {
		AdminUser adminUser = adminUserRepository.findByUsername(username);
		ModelAndView error = new ModelAndView();
		if (adminUser == null || adminUser.getUsername() == "") {
			error.addObject("message", "User name not exist.");
			error.setViewName("error");
			return error;
		}
		if (!adminUser.getPassword().equals(password)) {
			error.addObject("message", "Password is not matching.");
			error.setViewName("error");
			return error;
		}
		model.addAttribute("productList", new ProductList());
		return new ModelAndView("dashboard");
	}

	@RequestMapping(value = "/submitproduct", method = RequestMethod.POST)
	public ModelAndView submitProduct(@ModelAttribute("productList") ProductModel productModel, ModelMap model)
			throws IllegalStateException, IOException {
		System.out.println(">>>>>>>>>>>>" + productModel);

		File file = new File("src\\main\\resources\\static", "productimages");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}

		String filePath = file.getAbsolutePath() + "\\" + productModel.getProductPicUrl()[0].getOriginalFilename();
		String filePath2 = file.getAbsolutePath() + "\\" + productModel.getProductPicUrl()[1].getOriginalFilename();
		productModel.getProductPicUrl()[0].transferTo(new File(filePath));
		productModel.getProductPicUrl()[1].transferTo(new File(filePath2));

		model.addAttribute("name", productModel.getProductName());
		model.addAttribute("contactNumber", productModel.getFeature());
		model.addAttribute("id", productModel.getProductSize());
		int i = 0;
		String urls = "";
		for (MultipartFile iterable_element : productModel.getProductPicUrl()) {

			model.addAttribute("image" + i, iterable_element.getOriginalFilename());
			if (i == 0)
				urls = iterable_element.getOriginalFilename();
			else
				urls += "," + iterable_element.getOriginalFilename();

			i++;
		}
		ProductList pl = new ProductList();
		pl.setFeature(productModel.getFeature());
		pl.setProductDescription(productModel.getProductDescription());
		pl.setProductName(productModel.getProductName());
		pl.setProductPicUrl(urls);
		ProductList product = productRepository.save(pl);
		// System.out.println(product.getProductDescription());

		return new ModelAndView("productView");
	}

	public EntityManager getEntityManager() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		return entitymanager;

	}
}