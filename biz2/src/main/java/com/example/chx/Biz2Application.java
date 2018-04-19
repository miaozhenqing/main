package com.example.chx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Biz2Application {

	public static void main(String[] args) {
		SpringApplication.run(Biz2Application.class, args);
	}
}
