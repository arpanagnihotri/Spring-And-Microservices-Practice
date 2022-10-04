package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.*;
import com.example.repository.*;


@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	
	
	public Employee getEmployee(int id){
		return employeeRepository.findById(id).orElse(null);
	}
	
	
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
	
	
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
	

	public void deleteAllEmployees(){
		employeeRepository.deleteAll();
	}
	
	
	public void deleteEmployeeByID(int id){
		employeeRepository.deleteById(id);
	}
	
	
	public void patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeID()) {
			employeeRepository.save(emp);
		}
	}
}