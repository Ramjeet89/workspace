package core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleJava8 {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
		employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
		employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
		employees.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));

		System.out.println("Employees: " + employees);

		// sort by name
		Collections.sort(employees, Comparator.comparing(Employee::getName));
		System.out.println("Employee (After Sorting by name): " + employees);

		// sort by ID
		Collections.sort(employees, Comparator.comparing(Employee::getId));
		System.out.println("Employee (After Sorting by Id): " + employees);

		// sort by salary
		Collections.sort(employees, Comparator.comparing(Employee::getSalary));
		System.out.println("Employee (After Sorting by Salary): " + employees);

		// sort by joiningdate
		Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
		System.out.println("Employee (After Sorting by JoiningDate): " + employees);

		// chaining multiple comprator
		System.out.println("chaining multiple comprator");
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
		System.out.println("Employee sort by Salary and Name: " + employees);

		// chaining multiple comprator
		System.out.println("Employee (Sort by all properties");
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getId)
				.thenComparing(Employee::getName).thenComparing(Employee::getJoiningDate));

		System.out.println("Employee All the properties (Sorting): " + employees); 

	}
}
