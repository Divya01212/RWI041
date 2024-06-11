package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        Student s1 =(Student)context.getBean("s1");
        System.out.println(s1);
        Student2 s2 =(Student2)context.getBean("s2");
        System.out.println(s2);
    }
}
