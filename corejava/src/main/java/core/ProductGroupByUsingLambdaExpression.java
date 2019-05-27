package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductGroupByUsingLambdaExpression {
	public static void main(String[] args) {
		List<Product> product = new ArrayList<Product>();
		product.add(new Product("p1", "mobile-1", 1000, 2, "Manufacturer 1"));
		product.add(new Product("p2", "mobile-2", 700, 4, "Manufacturer 1"));
		product.add(new Product("p3", "mobile-1", 1400, 6, "Manufacturer 1"));
		product.add(new Product("p4", "laptop-1", 1200, 9, "Manufacturer 1"));
		product.add(new Product("p5", "laptop-2", 1000, 9, "Manufacturer 1"));
		product.add(new Product("p6", "laptop", 7000, 5, "Manufacturer 1"));

		System.out.println("Find the Group By using Lambda Expression");

		Map group = product.stream().collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));
		for (Object groupName : group.keySet()) {
			System.out.println("Group Name: " + groupName);
			System.out.println("Products: " + group.get(groupName));
			System.out.println("=============================");
		}
		
		System.out.println("Calculate the total number of products in each group:");
		Map calculateGroup = product.stream().collect(Collectors.groupingBy(Product::getManufacturer,Collectors.summarizingInt(Product::getQuantity)));
		for(Object groupName : calculateGroup.keySet()) {
			System.out.println("Group Name: "+groupName);
			System.out.println("Total Number  of products: "+calculateGroup.get(groupName));
			System.out.println("==========================");
		}
	}
}
