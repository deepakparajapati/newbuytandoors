package com.buytandoors.webapp.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.buytandoors.webapp.entity.Product;
import com.buytandoors.webapp.entity.ProductList;
import com.buytandoors.webapp.model.ProductModel;
import com.buytandoors.webapp.repository.ProductRepository;
import com.buytandoors.webapp.repository.ProductSizeRepository;
import com.buytandoors.webapp.services.ProductService;

@Controller
public class FunctionController {

//	@Autowired
//	AdminUserRepository adminUserRepository;

//	@Autowired
//	AuthenticationManager authenticationManager;
	
//	@Autowired
//	UserDetailServiceImpl uds;
	
	@Autowired
	ProductService productServicesImpli;
	
	@Autowired
	ProductSizeRepository productSizeRepository;
	
	@Autowired
	ProductRepository productRepository;

	@GetMapping(value = {"/", "/home"})
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("index");
//		List<Product> productList = productRepository.findAll();
		
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/myerror", method = RequestMethod.GET)
	public Model myerror(@RequestParam("message") String errormessage, Model model) {
		System.out.println(errormessage);
		model.addAttribute("message", errormessage);
		return model;
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public ModelAndView success() {
		return new ModelAndView("success");
	}

	
	@GetMapping(value = "/dashboard")
	public ModelAndView dashboard(Model model) {
		List<String> listofbodymaterial = Arrays.asList("Stainless Steel","Mild Steel","Copper", "Brass", "Other");
		List<String> listofbodyshapes = Arrays.asList("Round","Square","Ractangular", "Barrel", "Other");
		List<String> listofsize = productSizeRepository.findSize();
		System.out.println(listofsize);
 		model.addAttribute("listofbodyshapes", listofbodyshapes);
		model.addAttribute("listofbodymaterial", listofbodymaterial);
		model.addAttribute("listofsize", listofsize);
		model.addAttribute("productModel", new ProductModel());
		return new ModelAndView("dashboard");
	}
	
	// SPRING SECURITY

//	@PostMapping(value = "/auth")
//	public String auth(@Validated @RequestParam("username") String username,
//			@RequestParam("password") String password, Model model) {
//		System.out.println("auth cont" + username + password);
//			try {
//				Authentication authentication = authenticationManager
//						.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//				System.out.println("isAuthenticated"+authentication.isAuthenticated());
//				SecurityContextHolder.getContext().setAuthentication(authentication);
//				uds.loadUserByUsername(username);
//				model.addAttribute("productList", new ProductList());
//				return "redirect:dashboard";
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new UsernameNotFoundException("UnAuthorized User");
//			}
////		} else {
////			return ResponseEntity.status(HttpStatus.OK).body("Invalid User");
////		}
//	}

//		AdminUser adminUser = adminUserRepository.findByUsername(username);
//		if (adminUser == null || adminUser.getUsername().equals("")) {
//			model.addAttribute("message", "No user name found.");
//			return new ModelAndView("error");
//		}
//		if (!(adminUser.getPassword() == null || adminUser.getPassword().equals(password))) {
//			model.addAttribute("message", "password is incorrect");
//			return new ModelAndView("error");
//		}
//		model.addAttribute("productList", new ProductList());
//		return new ModelAndView("dashboard");

	@PostMapping(value = "/submitproduct")
	public String submitProduct( @ModelAttribute("productModel") @Valid ProductModel productModel,BindingResult bindingResult, ModelMap model) {
//		System.out.println(productModel.toString());
		System.err.println(bindingResult);
//		System.err.println(errors);
		if (bindingResult.hasErrors()) {
			System.out.println("myerror?message="+bindingResult.getFieldError().getDefaultMessage());
			model.addAttribute("message", bindingResult.getFieldError().getField() + " " +bindingResult.getFieldError().getDefaultMessage());
			return "myerror";
		}
//		String filePath = file.getAbsolutePath() + "\\" + productModel.getProductPicUrl()[0].getOriginalFilename();
//		String filePath2 = file.getAbsolutePath() + "\\" + productModel.getProductPicUrl()[1].getOriginalFilename();
//		productModel.getProductPicUrl()[0].transferTo(new File(filePath));
//		productModel.getProductPicUrl()[1].transferTo(new File(filePath2));

//		model.addAttribute("name", productModel.getProductName());
//		model.addAttribute("contactNumber", productModel.getFeature());
//		model.addAttribute("id", productModel.getProductSize());
//		model.addAttribute("image" + i, iterable_element.getOriginalFilename());
//		ProductServicesImpli productServicesImpli = new ProductServicesImpli();
		ProductList product = productServicesImpli.addProductProcess(productModel);
		if (product == null) {
			return "fail";
		}
		return "success";
	}

//	public EntityManager getEntityManager() {
//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
//		EntityManager entitymanager = emfactory.createEntityManager();
//		return entitymanager;
//
//	}
}