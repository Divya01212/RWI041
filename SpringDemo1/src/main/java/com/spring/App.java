package com.spring;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
       ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
       Employee emp =(Employee)context.getBean("emp");
       System.out.println(emp);
    }

	
	}

	

	
	