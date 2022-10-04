package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.*;
import com.example.repository.*;

@Service
public class DepartmentServiceImp implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments(){
		List<Department> depts = (List<Department>)departmentRepository.findAll(); 
		return depts;
	}
	

	public Department getDepartment(int id){
		return departmentRepository.findById(id).orElse(null);
	}

	public void addDepartment(Department d) {
		departmentRepository.save(d);
	}
	

	public void updateDepartment(Department d, int id){
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
	}
	

	public void deleteAllDepartment(){
		departmentRepository.deleteAll();
	}
	

	public void deleteDepartmentByID(int id){
		departmentRepository.deleteById(id);
	}
	
	
	public void patchDepartment(Department d, int id) {
		if(id == d.getDepartment_ID()) {
			departmentRepository.save(d);
		}
	}
}