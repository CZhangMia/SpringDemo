package com.example.demo1.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo1.model.Employee;

@Repository("another db")
public class EmployyDataAccessService implements EmployeeDao{

	@Override
	public List<Employee> selectAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> run(String... args) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
