package com.aktech.standards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.aktech")
@EnableJpaRepositories
@EnableEurekaClient
public class StandardsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardsServiceApplication.class, args);
	}

}
