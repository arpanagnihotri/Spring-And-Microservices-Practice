package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void updateEmployee(int id, Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		
	}

}
