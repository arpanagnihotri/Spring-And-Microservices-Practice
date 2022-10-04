package com.serviceL;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;
	public Employee() {
		this(0,null,0);
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.getName().compareToIgnoreCase(o.getName())<0) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
