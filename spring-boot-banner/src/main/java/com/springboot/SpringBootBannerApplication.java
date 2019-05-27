package com.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootBannerApplication.class);
		app.setBannerMode(Mode.CONSOLE);
		app.run(args);
	}
}
