package com.buytandoors.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BuytandoorsProjectApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(BuytandoorsProjectApplication.class, args);
	}
	
	@Configuration
	public class AdditionalResourceWebConfiguration implements WebMvcConfigurer {
	    @Override
	    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	    	registry.addResourceHandler("/productspecimages/**").addResourceLocations("file:productspecimages/");
	        registry.addResourceHandler("/productimages/**").addResourceLocations("file:productimages/");
	    }
	}
	
}
