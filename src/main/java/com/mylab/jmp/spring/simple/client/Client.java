package com.mylab.jmp.spring.simple.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        getBean(context, "magazine");
    }

    private static Object getBean(ApplicationContext context, String id) {
        Object bean = context.getBean(id);
        System.out.println(bean.toString());
        return bean;
    }
}
