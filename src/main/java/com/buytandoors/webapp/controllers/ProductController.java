package com.buytandoors.webapp.controllers;

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
import org.springframework.web.servlet.ModelAndView;

import com.buytandoors.webapp.dao.AdminUser;
import com.buytandoors.webapp.dao.ProductList;
import com.buytandoors.webapp.modal.ProductModel;
import com.buytandoors.webapp.repository.AdminUserRepository;
import com.buytandoors.webapp.serviceImpl.ProductServicesImpli;

@RestController
public class ProductController {

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
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashboard() {
		return new ModelAndView("dashboard");
	}


	// SPRING SECURITY

	@RequestMapping( value = "/auth", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView auth(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		AdminUser adminUser = adminUserRepository.findByUsername(username);
		if (adminUser == null || adminUser.getUsername() == "") {
			model.addAttribute("message", "No user name found.");
			new ModelAndView("error");
		}
		if (!adminUser.getPassword().equals(password)) {
			model.addAttribute("message", "password is incorrect");
			new ModelAndView("error");
		}
		return new ModelAndView("dashboard");
	}

	@RequestMapping(value = "/submitproduct", method = RequestMethod.POST)
	public String submitProduct(@ModelAttribute("productList") ProductModel productModel, ModelMap model)
			throws IllegalStateException, IOException {

//		String filePath = file.getAbsolutePath() + "\\" + productModel.getProductPicUrl()[0].getOriginalFilename();
//		String filePath2 = file.getAbsolutePath() + "\\" + productModel.getProductPicUrl()[1].getOriginalFilename();
//		productModel.getProductPicUrl()[0].transferTo(new File(filePath));
//		productModel.getProductPicUrl()[1].transferTo(new File(filePath2));

//		model.addAttribute("name", productModel.getProductName());
//		model.addAttribute("contactNumber", productModel.getFeature());
//		model.addAttribute("id", productModel.getProductSize());
//		model.addAttribute("image" + i, iterable_element.getOriginalFilename());
		ProductServicesImpli productServicesImpli = new ProductServicesImpli();
		ProductList product = productServicesImpli.addProductProcess(productModel);
		if (product == null) {
			return "fail";
		}
		return "success";
	}

	public EntityManager getEntityManager() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		return entitymanager;

	}
}