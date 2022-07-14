package com.example.demo1.service;

import com.example.demo1.dao.EmployeeDao;
import com.example.demo1.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	private final EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeService(@Qualifier("oracle") EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> getAllEmployee(){
		System.out.println("here at service");
		return employeeDao.selectAllEmployee();
	}
	
	
	
}
