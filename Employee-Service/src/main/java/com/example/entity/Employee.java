package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table (name = "employee")
public class Employee {

	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeID;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_city")
	private String employeeCity;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public Employee(){
		
	}
	
	public Employee(int employeeID, String employeeName, String employeeCity, Department department) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
		this.department = department;
	}
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeCity="
				+ employeeCity + ", department=" + department.getDepartment_ID()+ "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}