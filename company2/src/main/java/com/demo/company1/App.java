package com.demo.company1;

import java.util.Collection;
import java.util.List;

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
		department.setDid(104);
		department.setDname("BFSI");
		
		Employee emp1=new Employee();
		emp1.setId(4);
		emp1.setName("Yuvraj");
		emp1.setCity("Lucknow");
		Employee emp2=new Employee();
		emp2.setId(5);
		emp2.setName("Vanshika");
		emp2.setCity("Hardoi");
	
		
		department.getEmp().add(emp1);
		emp1.setD(department);
		department.getEmp().add(emp2);
		emp2.setD(department);
		

		Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(department);
		session.save(emp1);
		session.save(emp2);
		
		/*Department d1=session.get(Department.class,101);
		System.out.println(d1.getDname());*/
		/*List<Employee> empl=d1.getEmp();
		
		for(Employee e:empl) {
			System.out.println(e);
		}*/
		
		session.getTransaction().commit();

    }
}
