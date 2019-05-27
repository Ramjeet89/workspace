package service;

import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeService {

	EmployeeDAO empDAO = new EmployeeDAO();
	
	public void addNewEmployee(Employee employee) {
		empDAO.addNewEmployee(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return empDAO.getAllEmployee();
	}
}
