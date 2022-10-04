package com.demo.company1;

import com.demo.company1.entity.Department;
import com.demo.company1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Department department=new Department();
		department.setDid(101);
		department.setDname("IT");
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Sandhya");
		emp.setCity("Lucknow");
		
		department.setEmp(emp);

		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(department);
		session.save(emp);
		
		session.getTransaction().commit();

    }
}
