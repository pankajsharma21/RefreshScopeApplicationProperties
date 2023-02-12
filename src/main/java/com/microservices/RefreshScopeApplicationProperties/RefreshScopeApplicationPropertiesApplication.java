package com.microservices.RefreshScopeApplicationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RefreshScopeApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefreshScopeApplicationPropertiesApplication.class, args);
	}

}
