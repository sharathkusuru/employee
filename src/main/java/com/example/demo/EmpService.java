package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpService {
	  
	@Autowired
	EmpRepository empRepository;

	public List<Employee> getAll() {
		return empRepository.getAll();
	}

	public String add(Employee emp) {
		return empRepository.add(emp);
	}



	
	

}
