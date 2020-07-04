package com.buytandoors.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BuytandoorsProjectApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(BuytandoorsProjectApplication.class, args);
	}
}
