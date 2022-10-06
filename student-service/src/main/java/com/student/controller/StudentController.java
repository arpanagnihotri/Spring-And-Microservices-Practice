package com.student.controller;

import java.util.List;


import com.student.entity.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}

	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id){
		return studentService.getStudent(id);
	}
	

	@PostMapping("/student")
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
	}

	@PutMapping("/student/{id}")
	public void updateStudent(@RequestBody Student s, @PathVariable int id){
		studentService.updateStudent(s, id);
	}

	
}
