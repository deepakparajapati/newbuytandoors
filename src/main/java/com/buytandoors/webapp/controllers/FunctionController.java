package com.buytandoors.webapp.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

@Controller
public class FunctionController {

	@Autowired
	ProductService productServicesImpli;

	@Autowired
	ProductSizeRepository productSizeRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductShapeRepository productShapeRepository;

	@Autowired
	ProductListRepository productListRepository;
	
	@Autowired
	ProductWeightRepository productWeightRepository;

	@GetMapping(value = { "/", "/home","/index" })
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("index");
		List<ProductList> productList = productListRepository.findAllAvailable();
		List<ProductSizeEntity> productSizeEntities = productSizeRepository.findAll();
		List<ProductWeightEntity> productWeightEntity = productWeightRepository.findAll();
		HashMap<Long, String> sizes = new HashMap<>();
		HashMap<String, List<String>> allSizes = new HashMap<>();
		HashMap<String, List<Integer>> weightSize = new HashMap<>();
		// {Small, [W32xH32xL36 Mouth 15, Small, capacity]}
		// {smallround, [50, 60]}

		for (ProductSizeEntity productSizeEntity : productSizeEntities) {
			if(productSizeEntity.getProductMouth() == 0 || productSizeEntity.getCapacityPerBread().equals("")) {
				allSizes.put(productSizeEntity.getProductSize(),
						Arrays.asList(
								"W" + productSizeEntity.getProductWidth() + "x" + "H" + productSizeEntity.getProductHeight()
										+ "x" + "L" + productSizeEntity.getProductLength()));
			}else {
				allSizes.put(productSizeEntity.getProductSize(),
						Arrays.asList(
								"W" + productSizeEntity.getProductWidth() + "x" + "H" + productSizeEntity.getProductHeight()
										+ "x" + "L" + productSizeEntity.getProductLength()+" inch",
								"Mouth: "+Integer.toString(productSizeEntity.getProductMouth())+" inch",
								"Bread Capacity: "+productSizeEntity.getCapacityPerBread()+"breads"));	
			}
			sizes.put(productSizeEntity.getSizeId(), productSizeEntity.getProductSize());
		}
		for (ProductWeightEntity pwe : productWeightEntity) {
			weightSize.put(sizes.get(pwe.getSizeId()) + pwe.getShape(), Arrays.asList(pwe.getGrossWeight(), pwe.getNetWeight()));
		}
		model.addObject("weightSize", weightSize);
		model.addObject("allSizes", allSizes);
		model.addObject("productList", productList);
		return model;
	}

	@GetMapping(value = { "/home-tandoors" })
	public ModelAndView homeTandoorsPage() {
		ModelAndView model = new ModelAndView("hometandoors");
//		List<ProductList> productList = productListRepository.findAll();
//		model.addObject("productList", productList);
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/myerror", method = RequestMethod.GET)
	public Model myerror(@RequestParam("message") String errormessage, Model model) {
		model.addAttribute("message", errormessage);
		return model;
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public ModelAndView success() {
		return new ModelAndView("success");
	}

	@GetMapping(value = "/dashboard")
	public ModelAndView dashboard(ModelAndView model) {
		List<String> listofbodymaterial = Arrays.asList("Clay", "Stainless Steel", "Mild Steel", "Copper", "Brass",
				"Other");
//		List<String> listofbodyshapes = Arrays.asList("Round","Square","Ractangular", "Barrel", "Dome Shape","Cylindrical", "Other");
		List<String> listofProductTopCategory = Arrays.asList("tandoors", "pizza_ovens", "accessories");
		List<String> listofsize = productSizeRepository.findSize();
		List<String> listofbodyshapes = productShapeRepository.findShapes();
//		System.out.println(listofsize);
		model.addObject("listofbodyshapes", listofbodyshapes);
		model.addObject("listofbodymaterial", listofbodymaterial);
		model.addObject("listofsize", listofsize);
		model.addObject("listofProductTopCategory", listofProductTopCategory);
		model.addObject("productModel", new ProductModel());
		model.addObject("productSizeWeightShapeModel", new ProductSizeWeightShapeModel());
		model.setViewName("dashboard");
		return model;
	}
	
	@GetMapping(value = "/product-view")
	public ModelAndView productView(ModelAndView model) {
		List<ProductList> productList = productListRepository.findAll();
		model.addObject("productList", productList);
		model.setViewName("product-view");
		model.addObject("productModel", new ProductModel());
		return model;
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
	public String submitProduct(@ModelAttribute("productModel") @Valid ProductModel productModel,
			BindingResult bindingResult, ModelMap model) {
//		System.err.println(errors);
		if (bindingResult.hasErrors()) {
			model.addAttribute("message",
					bindingResult.getFieldError().getField() + " " + bindingResult.getFieldError().getDefaultMessage());
			return "myerror";
		}
		ProductList product = productServicesImpli.addProductProcess(productModel);
		if (product == null) {
			return "fail";
		}
		return "success";
	}

}