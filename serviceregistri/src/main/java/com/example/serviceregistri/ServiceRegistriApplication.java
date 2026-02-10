package com.example.serviceregistri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistriApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistriApplication.class, args);
	}

}
