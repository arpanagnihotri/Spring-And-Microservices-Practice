package com.company.department;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String city;
	
	@ManyToMany(mappedBy="employee")
	private List<Department> d=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	public List<Department> getD() {
		return d;
	}
	public void setD(List<Department> d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
