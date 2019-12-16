package com.buytandoors.webapp.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
import com.buytandoors.webapp.repository.AdminUserRepository;

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

//	consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE
	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView auth(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
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
	public String submitProduct(@RequestParam("productPicUrl") MultipartFile[] productPicUrl, @ModelAttribute("productList") ProductList productList,  BindingResult result, ModelMap model) {
		System.out.println("========>"+productPicUrl.length);
		System.out.println("Model Map: "+productList.toString());
		return "Submit successfully";
	}

	public EntityManager getEntityManager() {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		return entitymanager;

	}
}
