package com.chen.helloweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HellowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowebApplication.class, args);
	}
}
