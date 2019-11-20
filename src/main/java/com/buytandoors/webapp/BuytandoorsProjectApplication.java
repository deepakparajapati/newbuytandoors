package com.buytandoors.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.buytandoors.webapp.controllers")
public class BuytandoorsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuytandoorsProjectApplication.class, args);
	}
}
