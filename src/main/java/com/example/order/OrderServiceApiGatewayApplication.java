package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApiGatewayApplication.class, args);
	}

}
