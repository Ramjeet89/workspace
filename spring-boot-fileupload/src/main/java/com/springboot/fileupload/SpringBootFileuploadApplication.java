package com.springboot.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.springboot.filed.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
public class SpringBootFileuploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileuploadApplication.class, args);
	}
}
