package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayCollegeStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayCollegeStudentApplication.class, args);
	}

}
