package com.mylab.jmp.spring.simple.client;

import com.mylab.jmp.spring.simple.beans.Developer;
import com.mylab.jmp.spring.simple.beans.Manager;
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

        Developer scalaDeveloper = (Developer) getBean(context, "scalaDev");
        scalaDeveloper.setSkill("Delphi");
        Developer scalaDeveloper2 = (Developer) getBean(context, "scalaDev");
        System.out.println(String.format("is same object = %b", scalaDeveloper == scalaDeveloper2));

        Developer delphiDeveloper = (Developer) getBean(context, "delphiDev");
        scalaDeveloper.setSkill("Scala");
        Developer delphiDeveloper2 = (Developer) getBean(context, "delphiDev");
        System.out.println(String.format("is same object = %b", delphiDeveloper == delphiDeveloper2));

        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Developer scalaDeveloperSameAs1 = (Developer) getBean(context2, "scalaDev");
        System.out.println(scalaDeveloper.toString());
        System.out.println(String.format("is same object = %b", scalaDeveloper == scalaDeveloperSameAs1));

        getBean(context, "manager");
    }

    private static Object getBean(ApplicationContext context, String id) {
        Object bean = context.getBean(id);
        System.out.println(bean.toString());
        return bean;
    }
}
