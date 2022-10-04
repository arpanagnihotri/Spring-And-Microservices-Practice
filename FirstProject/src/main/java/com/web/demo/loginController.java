package com.web.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.demo.service.LoginService;


@Controller
public class loginController {
	
	@Autowired
	LoginService service;
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showloginMessage(ModelMap model) {
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String showWelcomeMessage(@RequestParam int id,@RequestParam String name,@RequestParam String password,@RequestParam int salary,ModelMap model) {
		boolean isValidUser=service.validateUser(id,name, password,salary);
		if(!isValidUser) {
			model.put("errorMessage","Invalid Credentials");
			return "login";
		}
		model.put("id", id);
		model.put("name", name);
		model.put("password", password);
		model.put("salary", salary);
		
		return "welcome";
	}
}
