package psu.edu.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import psu.edu.quiz.dao.EmployeeRepository;
import psu.edu.quiz.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);
		
		Employee theEmployee = null;
		
		if (result.isPresent()) {
			theEmployee = result.get();
		}else {
			throw new RuntimeException("Did not find employee id " + theId);
		}
		
		return theEmployee;
	}
	
	@Override
	public Employee save(Employee theEmployee) {
		return employeeRepository.save(theEmployee);
	}
	
	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}
	
	@Override
	public List<Employee> findEmployee(String last_name) {
		return employeeRepository.findByLastNameContainingIgnoreCase(last_name);
	}
	

}
