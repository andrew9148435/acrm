package com.andrew;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


        AbstractApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
        Main main = (Main) context.getBean("test");

//        Main main = new Main();
        main.perform();

    }
}
