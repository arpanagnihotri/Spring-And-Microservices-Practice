package com.example.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.*;
import com.example.service.*;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImp employeeService;
	

	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}

	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id){
		return employeeService.getEmployee(id);
	}
	

	@PostMapping("/employees")
	public void addEmployees(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable int id){
		employeeService.updateEmployee(e, id);
	}
	

	@DeleteMapping("/employees")
	public void deleteAllEmployees(){
		employeeService.deleteAllEmployees();
	}


	@DeleteMapping("employees/{id}")
	public void deleteEmployeeByID(@RequestBody Employee e, @PathVariable int id){
		employeeService.deleteEmployeeByID(id);
	}


	
}