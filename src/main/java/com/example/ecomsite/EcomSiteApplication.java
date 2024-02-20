package com.example.ecomsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.ecomsite")
public class EcomSiteApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcomSiteApplication.class, args);
	}
}
