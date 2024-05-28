package com.tec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //creating question
        Question q1=new Question();
        q1.setQuestionid(1212);
        q1.setQuestion("What is java ?");
        
        //creating answer
        Answer a1= new Answer();
        a1.setAnswerId(343);
        a1.setQuestion(q1);
        a1.setAnswer("Java is programming language");
        
       q1.setAnswer(a1);
       
       
       
       //creating question
       Question q2=new Question();
       q2.setQuestionid(112);
       q2.setQuestion("What is collection framework ?");
       
       //creating answer
       Answer a2= new Answer();
       a2.setAnswerId(342);
       a2.setAnswer("Api to work with objects in java");
       a1.setQuestion(q2);
       q2.setAnswer(a2);
     
       
       //session
       Session s= factory.openSession();
       Transaction tx= s.beginTransaction();
       //save
       s.save(q1);
       s.save(q2);
       s.save(a1);
       s.save(a2);
        s.close();
        factory.close();
    }
}
