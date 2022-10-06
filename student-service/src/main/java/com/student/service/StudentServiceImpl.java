package com.student.service;

import java.util.List;
import java.util.stream.Collectors;


import com.student.entity.Student;
import com.student.repository.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private	StudentRepo sr;
	

	public List<Student> getAllStudent(){
		List<Student> st = (List<Student>)sr.findAll(); 
		return st;
	}
	
	
	public Student getStudent(int id){
		return sr.findById(id).orElse(null);
	}
	
	
	public void addStudent(Student s) {
		sr.save(s);
	}
	
	
	public void updateStudent(Student st, int id){
		if(id == st.getStId()) {
			sr.save(st);
		}
	}


	
}
