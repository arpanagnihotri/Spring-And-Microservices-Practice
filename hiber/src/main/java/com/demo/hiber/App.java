package com.demo.hiber;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        Query q=session.createQuery("select id,name,address from Student where id=5");
        Object[] student=(Object[]) q.uniqueResult();
       // List<Student>students=q.list();
        System.out.println(student[0] + ":" + student[1] +":"+ student[2]);
       /* for(int i=1;i<=20;i++) {
        	   Student st=new Student();
        	   st.setId(i);
        	   st.setName("Name "+ i);
        	   st.setAddress("Address "+i+i);
        	   session.save(st);
        }*/
        
        /*for(Student s:students) {
        	System.out.println(s);
        }*/
        
        tx.commit();
      
    }
}
