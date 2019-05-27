package com.springboot.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.springboot.beans.Employee;

@SpringBootApplication
@ImportResource({ "classpath*:applicationContext.xml" })
public class SpringBootXmlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootXmlApplication.class, args);
		Employee emp = (Employee) ctx.getBean("employee1");
		emp.showDetails();
	}
}
