package com.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Student s=new Student();
    	s.setEmployeeId(101);
    	s.setName("Siya");
    	s.setEmail("divya42@gmail.com");
    	
    	Address a=new Address();
    	a.setAddressId(0);
        a.setCity("Rewa");
        a.setState("Madhya Pradesh");
        a.setCountry(" india");
        a.setPincode(486001);
        s.setAddress(a);
      
       
    Session session=factory.openSession();
    Transaction tx=session.beginTransaction();
   
    session.save(s);
  
    tx.commit();
    session.close();
    factory.close(); 	
}
}
