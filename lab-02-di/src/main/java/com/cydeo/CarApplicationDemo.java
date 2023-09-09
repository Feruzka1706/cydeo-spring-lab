package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.repository.CartRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class CarApplicationDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        System.out.println(context.getBean(CartRepositoryImpl.class));

    }

}
