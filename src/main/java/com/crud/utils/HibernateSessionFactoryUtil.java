package com.crud.utils;


import com.crud.repository.Hibernate.HiberLabelRepository;
import com.crud.repository.Hibernate.HiberPostRepository;
import com.crud.repository.Hibernate.HiberWriterRepository;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration()
                        .configure("hibernate.cfg.xml").addAnnotatedClass(HiberLabelRepository.class)
                        .addAnnotatedClass(HiberPostRepository.class)
                        .addAnnotatedClass(HiberWriterRepository.class).buildSessionFactory();

                          } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
