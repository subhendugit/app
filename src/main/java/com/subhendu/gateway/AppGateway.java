package com.subhendu.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.subhendu")
public class AppGateway {
	
	public static void main(String[] args) {
		SpringApplication.run(AppGateway.class, args);
	}

}
