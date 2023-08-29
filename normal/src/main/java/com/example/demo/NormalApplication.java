package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

import com.example.demo.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","in.walmart"})
public class NormalApplication {

	public static void main(String[] args) {
		SpringApplication.run(NormalApplication.class, args);
	}
	
	@Bean
	public AppSecurity createInstance() {
		AppSecurity as = new AppSecurity();
		// Logic code
		return as;
	}

}
