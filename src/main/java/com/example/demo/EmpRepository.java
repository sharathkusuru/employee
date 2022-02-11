package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository  
public class EmpRepository {
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		
		return employee;
	}

	public String add(Employee emp) {
		employee.add(emp);
		return "sucessfully added";
	}

	

	

	
	
	
}
