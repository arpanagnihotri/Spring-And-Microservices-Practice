package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) 
    {
    	 Student st=new Student();
         st.setId(1);
         st.setName("Arpan");
         st.setCity("Lucknow");
         Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
         
         SessionFactory sf=con.buildSessionFactory();
         Session session=sf.openSession();
         
         Transaction tx=session.beginTransaction();
         session.save(st);
         tx.commit();     
}
}
