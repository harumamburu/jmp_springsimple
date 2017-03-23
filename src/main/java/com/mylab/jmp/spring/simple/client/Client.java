package com.mylab.jmp.spring.simple.client;

import com.mylab.jmp.spring.simple.beans.Developer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Developer developer = getDeveloperBean(context, "dev");
        Developer javaDeveloper = getDeveloperBean(context, "javaDev");
        Developer intern = getDeveloperBean(context, "intern");

        intern.setSkill("Kotlin");
        intern.setLevel(1);
        System.out.println(intern.toString());
    }

    private static Developer getDeveloperBean(ApplicationContext context, String id) {
        Developer developer = context.getBean(id, Developer.class);
        System.out.println(developer.toString());
        return developer;
    }
}
