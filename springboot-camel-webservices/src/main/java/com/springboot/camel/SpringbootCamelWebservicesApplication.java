package com.springboot.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = "com.springboot.camel.spring")
public class SpringbootCamelWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCamelWebservicesApplication.class, args);
	}
}
