package com.netzwerk.ecommerce;

import com.netzwerk.ecommerce.controller.EcommController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class EcommerceApplication {

	public static void main(String[] args) {

		System.out.println("starting app");
		SpringApplication.run(EcommerceApplication.class, args);
		System.out.println("Running app");
	}

}
