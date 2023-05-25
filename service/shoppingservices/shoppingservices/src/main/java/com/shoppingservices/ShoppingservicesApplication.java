package com.shoppingservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingservicesApplication.class, args);
	}

}
