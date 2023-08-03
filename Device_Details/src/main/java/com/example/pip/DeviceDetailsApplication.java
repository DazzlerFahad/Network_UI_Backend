package com.example.pip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeviceDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceDetailsApplication.class, args);
	}

}
