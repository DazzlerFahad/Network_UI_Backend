package com.example.networkSetup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NetworkSetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkSetupApplication.class, args);
	}

}
