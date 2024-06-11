package com.springjdbc.SpringJdbc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.dao.EmployeeDaoImp;
import com.springjdbc.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context =new ClassPathXmlApplicationContext("spconfig.xml");
    EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
    
  Employee employee = new Employee();
    employee.setId(503);
    employee.setEname("tanya");
    employee.setCity("delhi");
// 
 int result=employeeDao.insert(employee);
 System.out.println("employee added" +result);

 
 
    }
}
