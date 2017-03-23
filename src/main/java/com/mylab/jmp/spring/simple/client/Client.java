package com.mylab.jmp.spring.simple.client;

import com.mylab.jmp.spring.simple.beans.Developer;
import com.mylab.jmp.spring.simple.beans.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Developer developer = (Developer) getBean(context, "dev");
        Developer javaDeveloper = (Developer) getBean(context, "javaDev");
        Developer intern = (Developer) getBean(context, "intern");

        intern.setSkill("Kotlin");
        intern.setLevel(1);
        System.out.println(intern.toString());

        Developer dotNetDeveloper = (Developer) getBean(context, "dotNetDev");

        Developer hacker = (Developer) getBean(context, "hacker");

        Project taxiProject = (Project) getBean(context, "taxiNuvo");
    }

    private static Object getBean(ApplicationContext context, String id) {
        Object bean = context.getBean(id);
        System.out.println(bean.toString());
        return bean;
    }
}
