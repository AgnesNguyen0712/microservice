package com.example.CatalogServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CatalogServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServerApplication.class, args);
	}

}
