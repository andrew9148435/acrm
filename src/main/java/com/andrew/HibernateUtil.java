package com.andrew;

import com.andrew.domain.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();

            Properties properties = new Properties();
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));


            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            configuration.addAnnotatedClass(Product.class);
            configuration.addAnnotatedClass(Category.class);
            configuration.addAnnotatedClass(Attribute.class);
            configuration.addAnnotatedClass(Tag.class);
            configuration.addAnnotatedClass(ProductAttribute.class);
            configuration.addAnnotatedClass(ProductCategory.class);
            configuration.addAnnotatedClass(ProductCategoryId.class);
            configuration.addAnnotatedClass(ProductAttributeId.class);
            configuration.addAnnotatedClass(CategoryAttribute.class);
            configuration.addAnnotatedClass(CategoryAttributeId.class);
            configuration.addAnnotatedClass(ProductTag.class);
            configuration.addAnnotatedClass(ProductTagId.class);

            SessionFactory newSessionFactory = configuration.buildSessionFactory(serviceRegistry);
            // Create the SessionFactory from hibernate.cfg.xml
            return newSessionFactory;
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

}
