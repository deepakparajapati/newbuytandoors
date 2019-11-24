package com.buytandoors.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.buytandoors.webapp.entity.AdminUser;
import com.buytandoors.webapp.repository.AdminUserRepository;

@RestController
public class ProductController{
	
	@Autowired
	AdminUserRepository adminUserRepository;

	@RequestMapping(value="/home",method = RequestMethod.GET)
	public ModelAndView homePage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	
//	consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE
	@RequestMapping(value="/auth",method = RequestMethod.POST)
	@ResponseBody
	public void auth(@RequestParam("username") String username, @RequestParam("password") String password) {
		AdminUser adminUser = new AdminUser();
		adminUser.setUsername(username);
		adminUser.setPassword(password);
//		adminUserRepository.getOne(adminUser, );
	}

}
