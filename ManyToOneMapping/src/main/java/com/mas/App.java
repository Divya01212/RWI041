package com.mas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Creating a teacher
        Teacher teacher = new Teacher();
        teacher.setName("Mr. Smith");

        // Creating students
        Student student1 = new Student();
        student1.setName("John");
        student1.setTeacher(teacher);

        Student student2 = new Student();
        student2.setName("Alice");
        student2.setTeacher(teacher);

        // Session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Saving objects
        session.save(teacher);
        session.save(student1);
        session.save(student2);

        transaction.commit();
        session.close();
        factory.close();
    }
}
