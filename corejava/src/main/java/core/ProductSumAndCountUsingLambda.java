package core;

import java.util.ArrayList;
import java.util.List;

public class ProductSumAndCountUsingLambda {

	public static void main(String[] args) {
		List<Product> product = new ArrayList<>();

		product.add(new Product("p1", "mobile-1", 1000, 2, "Manufacturer 1"));
		product.add(new Product("p2", "mobile-2", 7000, 4, "Manufacturer 1"));
		product.add(new Product("p3", "mobile-1", 1400, 6, "Manufacturer 1"));
		product.add(new Product("p4", "laptop-1", 1200, 9, "Manufacturer 1"));
		product.add(new Product("p5", "laptop-2", 1000, 9, "Manufacturer 1"));
		product.add(new Product("p6", "laptop", 7000, 5, "Manufacturer 1"));

		int s1 = product.stream().mapToInt(p -> p.getQuantity()).sum();
		System.out.println("Sum all Quantity:: " + s1);

		int s2 = product.stream().filter(p -> p.getName().startsWith("mobile")).mapToInt(p -> p.getQuantity()).sum();
		System.out.println("Sum Quantities of mobile starts with mobile:: " + s2);

		long s3 = product.stream().mapToLong(p -> p.getQuantity() * p.getPrice()).sum();
		System.out.println("Total:: " + s3);
		
		
		long result = product.stream().filter(p->p.getPrice()>700).count();
		System.out.println("Total Count Result:: "+result);
	}
}
