package com.example.demo1.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo1.model.Employee;

public interface EmployeeDao {
//	int insertEmployee(UUID id, Employee em);
	
//	default int insertEmployee(Employee em) {
//		UUID id = UUID.randomUUID();
//		return insertEmployee(id, em);
//	}
	default void Employee() {
		System.out.println("create a new employee");
    }

	List<Employee> selectAllEmployee();

	List<Employee> run(String... args) throws Exception;
}
