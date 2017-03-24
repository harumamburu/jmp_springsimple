package com.mylab.jmp.spring.simple.beans.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class AnotherPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " to be initialized with some humble help of AnotherPostProcessor");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " was initialized with some humble help of AnotherPostProcessor");
        return o;
    }
}
