package dao;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDAO {
	private List<Employee> testEmployee = new ArrayList<Employee>();
	
	public void addNewEmployee(Employee employee) {
		testEmployee.add(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return new ArrayList<Employee>(testEmployee);
	}

}
