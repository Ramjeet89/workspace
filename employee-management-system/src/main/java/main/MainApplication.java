package main;

import java.util.List;

import model.Employee;
import service.EmployeeService;

public class MainApplication {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee emp1 = new Employee("1", "Test1", "Manager", 1000);
		Employee emp2 = new Employee("1", "Test2", "Manager", 1000);
		Employee emp3 = new Employee("1", "Test3", "Manager", 1000);
		Employee emp4 = new Employee("1", "Test4", "Manager", 1000);
		Employee emp5 = new Employee("1", "Test5", "Manager", 1000);
		
		employeeService.addNewEmployee(emp1);
		employeeService.addNewEmployee(emp2);
		employeeService.addNewEmployee(emp3);
		employeeService.addNewEmployee(emp4);
		employeeService.addNewEmployee(emp5);
	
		List<Employee> employees  = employeeService.getAllEmployee();
		for(Employee emp:employees) {
			System.out.println(emp.toString());
		}
	}
}
