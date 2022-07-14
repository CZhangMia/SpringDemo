package com.example.demo1.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.model.Employee;
import com.example.demo1.service.EmployeeService;

@RequestMapping("api/v1/employee")
@RestController
public class EmployeeController {
	private EmployeeService employeeService = null;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("allemp")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
//	@PostMapping
//	public void addEmployee(@RequestBody Employee em)
//	{
//		System.out.println("request received: " + em.getName());
//		employeeService.addEmployee(em);
//	}
	
//	@GetMapping(path = "/{id}")
//	public Employee getEmployeeById(@PathVariable("id") UUID id) {
//		return employeeService.getEmployeeById(id).orElse(null);
//	}
//	
//	@DeleteMapping(path = "/{id}")
//	public void deleteEmployeeById(@PathVariable("id") UUID id) {
//		employeeService.deleteEmployee(id);
//	}
//	
//	@PutMapping (path = "/{id}")
//	public void updateEmployeeById(@PathVariable("id") UUID id, @NonNull @RequestBody Employee emp) {
//		employeeService.updateEmployee(id, emp);
//	}
//	
//	@GetMapping
//	@RequestMapping("testing")
//	public String testing() {
//		return employeeService.getTesting();
//	}
	
}
