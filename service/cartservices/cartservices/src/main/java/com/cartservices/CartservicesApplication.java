package com.cartservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CartservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartservicesApplication.class, args);
	}

}
