package psu.edu.quiz.service;

import java.util.List;

import psu.edu.quiz.entity.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	
	List<Employee> findAllSalaryGreaterThan(int salary);
	
	Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int theId);

}
