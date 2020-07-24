package com.example.springBootREST2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.companyname.controller")
public class SpringBootRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRest2Application.class, args);
	}

}
