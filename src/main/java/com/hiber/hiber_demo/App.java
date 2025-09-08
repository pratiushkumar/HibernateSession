package com.hiber.hiber_demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        // open a session from SessionFactory
        Session session = HibernateUtility.getsessionfactory().openSession();

        // start a transaction (needed for INSERT/UPDATE/DELETE)
        Transaction tx = session.beginTransaction();

        // create entity object
        Student student = new Student("Bob", "Bob421@gmail.com");
        Patient patient = new Patient("peter", "peter789@yahoo.in");
        student.setId(12);
        patient.setId(111);



        // save entity to DB (Hibernate returns generated primary key)
        session.merge(student);
        session.update(patient);
        // commit transaction
        tx.commit();

        // close session
        session.close();

        System.out.println("Session saved all things been done ");
    }
}
