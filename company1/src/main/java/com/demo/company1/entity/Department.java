package com.demo.company1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {
	
	@Id
	private int did;
	private String dname;
	
	@OneToOne
	private Employee emp;
	
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
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", emp=" + emp + "]";
	}
	
	
	
}
