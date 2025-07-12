package com.Biikes.Bikes_section;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BikesSectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikesSectionApplication.class, args);
	}

}
