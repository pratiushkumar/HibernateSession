package com.hiber.hiber_demo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static SessionFactory sessionFactory;

    static {
        try {
            // Create configuration, load hibernate.cfg.xml
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

            // Add annotated classes explicitly (important in Hibernate 6)
            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(Patient.class);

            // Build session factory
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getsessionfactory() {
        return sessionFactory;
    }
}
