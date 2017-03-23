package com.mylab.jmp.spring.simple.client;

import com.mylab.jmp.spring.simple.beans.Developer;
import com.mylab.jmp.spring.simple.beans.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        getBean(context, "dev");
        getBean(context, "javaDev");

        Developer intern = (Developer) getBean(context, "intern");
        intern.setSkill("Kotlin");
        intern.setLevel(1);
        System.out.println(intern.toString());

        getBean(context, "dotNetDev");
        getBean(context, "hacker");
        getBean(context, "taxiNuvo");
        getBean(context, "java10");
    }

    private static Object getBean(ApplicationContext context, String id) {
        Object bean = context.getBean(id);
        System.out.println(bean.toString());
        return bean;
    }
}
