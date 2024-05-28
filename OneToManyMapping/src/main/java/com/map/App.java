package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml ");
        SessionFactory factory = cfg.buildSessionFactory();

      Question q1=new Question();
      q1.setQuestionId(1212);
      q1.setQuestion("what is java");
      
        //creating answer
        Answer a1 = new Answer();
        a1.setAnswerId(343);
        a1.setAnswer("Java is programming language");
        a1.setQuestion(q1);
        
        Answer a2 = new Answer();
        a2.setAnswerId(346);
        a2.setAnswer("With the help of java we can create new softwares");
        a2.setQuestion(q1);
        
        Answer a3 = new Answer();
        a3.setAnswerId(348);
        a3.setAnswer("java has different type of framework");
        a3.setQuestion(q1);
        
        List<Answer> list = new ArrayList<Answer>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        q1.setAnswers(list);

        //session
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        //save
        s.save(q1);
        s.save(a1);
        s.save(a2);
        s.save(a3);
        
        
        tx.commit();
        s.close();
        factory.close();
    }
}
