package psu.edu.quiz.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
 
import psu.edu.quiz.entity.Employee;
import psu.edu.quiz.service.EmployeeService;


@Controller


@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
    
	public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }
    
	// add mapping for "/list"    
	@GetMapping("/list")
    public String listEmployees(Model theModel) {
        
		// get the employees from db
        List<Employee> theEmployees = employeeService.findAll();
        
        // add to the spring model
        theModel.addAttribute("employees", theEmployees);
        return "list-employees";
    }

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		// create model attribute to bind form data
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee", theEmployee);
		return "employee-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employee_id") int theId,Model theModel) {
		
		Employee theEmployee = employeeService.findById(theId);
		theModel.addAttribute("employee",theEmployee);
		return "employee-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee_id") Employee theEmployee) {
		employeeService.save(theEmployee);
		
		return "redirect:/employees/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employee_id") int theId) {
		employeeService.deleteById(theId);
		
		return "redirect:/employees/list";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("last_name") String last_name, Model theModel) {
	    List<Employee> searchEmployees = employeeService.findEmployee(last_name);
	    
	    theModel.addAttribute("employees", searchEmployees);
	    return "list-employees";
	}
}
