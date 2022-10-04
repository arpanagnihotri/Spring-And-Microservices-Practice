package com.company.company;

import com.company.department.Department;
import com.company.department.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class CompanyApplication {

	public static void main(String[] args) {
		
		Department department=new Department();
		department.setdId(103);
		department.setdName("Delivery");
	
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("Garima Sinha");
		emp.setCity("Bokaro");
		
		Employee emp1=new Employee();
		emp1.setId(3);
		emp1.setName("Arpit Shukla");
		emp1.setCity("Bombay");
		
		department.getEmployee().add(emp);
		department.getEmployee().add(emp1);

		emp.getD().add(department);
		emp1.getD().add(department);
		
		

		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(department);
		session.save(emp);
		session.save(emp1);
		
		session.getTransaction().commit();
	}
	

}
