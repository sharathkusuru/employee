package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
     EmpService empService; 
	@GetMapping("/get/all")
	public List<Employee> getAll(){ 
		return empService.getAll();	
	}
	@PostMapping("/add")
	public String getAll(@RequestBody Employee emp){ 
		return empService.add(emp);	
	}
	
  

}
