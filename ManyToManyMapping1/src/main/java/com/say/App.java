package com.say;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Creating banks
        Bank bank1 = new Bank();
        bank1.setName("Bank A");

        Bank bank2 = new Bank();
        bank2.setName("Bank B");

        // Creating employees
        Employee employee1 = new Employee();
        employee1.setName("John");

        Employee employee2 = new Employee();
        employee2.setName("Alice");

        // Associating banks with employees
        employee1.getBanks().add(bank1);
        employee1.getBanks().add(bank2);

        employee2.getBanks().add(bank1);

        // Session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Saving objects
        session.save(bank1);
        session.save(bank2);
        session.save(employee1);
        session.save(employee2);

        transaction.commit();
        session.close();
        factory.close();
    }
}

