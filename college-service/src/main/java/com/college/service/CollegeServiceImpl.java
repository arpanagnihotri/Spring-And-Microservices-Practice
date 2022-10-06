package com.college.service;

import java.util.List;

import com.college.entity.College;
import com.college.repository.CollegeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService{

	/*List<College>list=List.of(
			new College(101,"IIMT Engineering College","Meerut"),
			new College(102,"IMS College","Noida"),
			new College(103,"AKTU","Lucknow")
			);*/
	@Autowired
	private CollegeRepo cr;
	
	/*@Override
	public College getCollege(int id) {
		return list.stream().filter(college->college.getcId()==id).findAny().orElse(null);
	}*/
	public List<College> getAllCollege(){
		List<College> college = (List<College>)cr.findAll(); 
		return college;
	}
	

	public College getCollege(int id){
		return cr.findById(id).orElse(null);
	}

	public void addCollege(College c) {
		cr.save(c);
	}
	

	public void updateCollege(College c, int id){
		if(id == c.getcId()) {
			cr.save(c);
		}
	}

}
