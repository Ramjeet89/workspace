package core;

import java.util.ArrayList;
import java.util.List;

public class ProductStreamExample {

	public static void main(String[] args) {
		List<Product> product = new ArrayList<>();
		product.add(new Product("p1", "mobile-1", 1000, 2, "Manufacturer 1"));
		product.add(new Product("p2", "mobile-2", 7000, 4, "Manufacturer 1"));
		product.add(new Product("p3", "mobile-1", 1400, 6, "Manufacturer 1"));
		product.add(new Product("p4", "mobile-2", 1200, 9, "Manufacturer 1"));
		product.add(new Product("p5", "mobile-3", 1000, 9, "Manufacturer 1"));
		product.add(new Product("p6", "mobile-4", 7000, 5, "Manufacturer 1"));

		System.out.println("Or Condition");
		product.stream().filter(p -> p.getId().equalsIgnoreCase("p1") || p.getId().equalsIgnoreCase("p3"))
				.forEach(p -> {
					System.out.println(p.toString());
					System.out.println("======================================");
				});

		System.out.println("And Condition");
		product.stream().filter(p -> p.getPrice() > 700 && p.getPrice() < 7000).forEach(p -> {
			System.out.println(p.toString());
			System.out.println("==============================================");
		});
	}
}
