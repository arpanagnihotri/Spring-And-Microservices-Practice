package com.demo.company1.entity;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int did;
	private String dname;
	
	@OneToMany(mappedBy="d")
	private List<Employee> emp=new ArrayList<>();
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", emp=" + emp + "]";
	}
	
}
