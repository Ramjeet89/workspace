package core;

import java.util.ArrayList;
import java.util.List;

public class ProductLambdaExpression {
	public static void main(String[] args) {
		
		List<Product> product = new ArrayList<>();
		
		product.add(new Product("p1", "mobile-1", 1000, 2, "Manufacturer 1"));
		product.add(new Product("p2", "mobile-2", 7000, 4, "Manufacturer 1"));
		product.add(new Product("p3", "mobile-1", 1400, 6, "Manufacturer 1"));
		product.add(new Product("p4", "laptop-1", 1200, 9, "Manufacturer 1"));
		product.add(new Product("p5", "laptop-2", 1000, 9, "Manufacturer 1"));
		product.add(new Product("p6", "laptop", 7000, 5, "Manufacturer 1"));

		System.out.println("Search starts with mo:");
		product.stream().filter(p -> p.getName().startsWith("mo")).forEach(p -> {
			System.out.println(p.toString());
			System.out.println("===================================");
		});

		System.out.println("Search Ends with top-1");
		product.stream().filter(p -> p.getName().endsWith("top-1")).forEach(p -> {
			System.out.println(p.toString());
			System.out.println("===================================");
		});

		System.out.println("Search Ends with top");
		product.stream().filter(p -> p.getName().endsWith("top")).forEach(p -> {
			System.out.println(p.toString());
			System.out.println("===================================");
		});
	}
}
