package com.java.camel.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext-camel.xml");
		actx.start();
		System.out.println("Application Context Started");
		try {
			Thread.sleep(5 * 60 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actx.stop();
		actx.close();
	}
}
