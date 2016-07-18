package com.andrew;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
//@PropertySource("jdbc.properties")
@ComponentScan("com.andrew")
public class PersistenceConfig  {


    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(restDataSource());
        sessionFactory.setPackagesToScan("com.andrew");
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @Bean
    public DataSource restDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/avontest");
        dataSource.setUsername("root");
        dataSource.setPassword("1111");

        return dataSource;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);
        return txManager;
    }

/*    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }*/

    Properties hibernateProperties() {
        return new Properties() {
            {
//                setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//                setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
                setProperty("hibernate.hbm2ddl.auto", "update");
                setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//                setProperty("hibernate.globally_quoted_identifiers", "true");
//                setProperty("hibernate.current_session_context_class", "true");
//                setProperty("hibernate.SQL", "DEBUG");
//                setProperty("hibernate.category", "trace");
                setProperty("hibernate.show_sql", "true");
//                setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
//                setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/avontest");
//                setProperty("hibernate.connection.username", "root");
//                setProperty("hibernate.connection.password", "1111");
//                setProperty("hibernate.current_session_context_class", "org.springframework.orm.hibernate5.SpringSessionContext");
//                setProperty("hibernate.current_session_context_class", "thread");

            }
        };
    }
}
