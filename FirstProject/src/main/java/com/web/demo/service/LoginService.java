package com.web.demo.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(int id,String username,String password,int salary) {
		return (id==1) && username.equalsIgnoreCase("Arpan") && password.equalsIgnoreCase("itsmytime") && (salary==26000);
	}
}
