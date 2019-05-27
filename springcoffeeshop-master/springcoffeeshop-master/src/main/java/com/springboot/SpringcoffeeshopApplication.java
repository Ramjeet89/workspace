package com.springboot;

import com.springboot.model.Product;
import com.springboot.repository.CustomerRepository;
import com.springboot.repository.OrderRepository;
import com.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Created by Ramjeet on 22/03/19.
 */

@SpringBootApplication
public class SpringcoffeeshopApplication implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringcoffeeshopApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Product bhelPoori = new Product();
		bhelPoori.setProductName("Bhel Poori");
		bhelPoori.setProductPrice(20.50);

		Product dahiKachori = new Product();
		dahiKachori.setProductName("Dahi Kachori");
		dahiKachori.setProductPrice(30.50);

		Product masalaPoori = new Product();
		masalaPoori.setProductName("Masala Poori");
		masalaPoori.setProductPrice(25.50);

		Product wadaPav = new Product();
		wadaPav.setProductName("Wada Pav");
		wadaPav.setProductPrice(40.50);

		productRepository.save(bhelPoori);
		productRepository.save(dahiKachori);
		productRepository.save(masalaPoori);
		productRepository.save(wadaPav);

	}
}
