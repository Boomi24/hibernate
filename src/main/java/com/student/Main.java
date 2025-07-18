package com.student;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Student_Details details = new Student_Details();
        
        details.setId(106);
        details.setName("Kulanthai velu");
        details.setTechnology("Music...");


       Configuration config = new Configuration();
       config.addAnnotatedClass(com.student.Student_Details.class);
       config.configure("hibernate.cfg.xml");

       SessionFactory factory = config.buildSessionFactory();

       Session session = factory.openSession();

       Transaction transaction = session.beginTransaction();

       session.persist(details);

       transaction.commit();

    }
}