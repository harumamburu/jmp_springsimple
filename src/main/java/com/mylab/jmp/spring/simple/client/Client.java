package com.mylab.jmp.spring.simple.client;

import com.mylab.jmp.spring.simple.beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Developer developer = context.getBean("dev", Developer.class);
        System.out.println(developer.toString());
    }
}
