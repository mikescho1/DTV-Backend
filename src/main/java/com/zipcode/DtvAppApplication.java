package com.zipcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.zipcode.controllers", "com.zipcode.filters", "com.zipcode.models",
	"com.zipcode.repositories", "com.zipcode.services", "com.zipcode.utility"})
public class DtvAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DtvAppApplication.class, args);
	}

}
