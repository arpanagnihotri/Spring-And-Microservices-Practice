package com.college.controller;


import java.util.List;

import com.college.entity.College;

import com.college.service.CollegeService;
import com.college.service.CollegeServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeServiceImpl collegeService;
	
	
	/*@GetMapping("/{cId}")
	public College getCollege(@PathVariable("cId") int cId) {
		College college=this.collegeService.getCollege(cId);
		List students=this.restTemplate.getForObject("http://student-service/student/college/"+college.getcId(),List.class);
		college.setStudents(students);
		return college;
	}*/
	
	@GetMapping("/college")
	public List<College> getAllCollege(){
		return collegeService.getAllCollege();
	}

	@GetMapping("/college/{id}")
	public College getCollege(@PathVariable int id){
		return collegeService.getCollege(id);
	}
	
	@PostMapping("/college")
	public void addCollege(@RequestBody College college){
		collegeService.addCollege(college);
	}

	@PutMapping("/college/{id}")
	public void updateCollege(@RequestBody College c, @PathVariable int id){
		collegeService.updateCollege(c, id);
	}
	
}
