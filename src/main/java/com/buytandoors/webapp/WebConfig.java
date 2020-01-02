package com.buytandoors.webapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//    	"/bootstrap/css/*", 
//    	registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//        registry.addResourceHandler("/*.js/**").addResourceLocations("/bootstrap/css/");
//        registry.addResourceHandler("/*.css/**").addResourceLocations("/bootstrap/css/");
    }
    
}
