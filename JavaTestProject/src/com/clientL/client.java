package com.clientL;

import java.util.*;

import com.serviceL.Employee;
import com.serviceL.EmployeeDao;
import com.serviceL.EmployeeDaoImpl;

public class client {

	public static void main(String[] args) {
		EmployeeDao ed=new EmployeeDaoImpl();
		Scanner sc=new Scanner(System.in);
		int id = 0,salary = 0;
		String name = null;
		int op=0;
		do {
			System.out.println("Choose one option.\n"
					+ "1. Insert the Employee.\n"
					+ "2. Update the Employee.\n"
					+ "3. Delete the Employee.\n"
					+ "4. Get all the Employees.");
			op=sc.nextInt();
			sc.nextLine();		
			switch(op) {
			case 1:
				System.out.println("Enter the Employee Id:");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Employee Name:");
				name=sc.nextLine();
				System.out.println("Enter the Employee salary:");
				salary=sc.nextInt();
				sc.nextLine();
				Employee e1=new Employee(id,name,salary);
				ed.insertEmployee(e1);
				break;
			case 2:
				System.out.println("Enter the Employee Id:");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Employee Name:");
				name=sc.nextLine();
				System.out.println("Enter the Employee salary:");
				salary=sc.nextInt();
				Employee e3=new Employee(id,name,salary);
				ed.updateEmployee(e3);
				break;
			case 3:
				System.out.println("Enter the Employee Id:");
				id=sc.nextInt();
				ed.deleteEmployee(id);
				break;
			case 4:
				Employee e2=new Employee(id,name,salary);
				ed.getAllEmployee(e2);
				break;
			default:
				System.out.println("Enter valid option.");
			}
		}
		while(op!=5);

	}

}
