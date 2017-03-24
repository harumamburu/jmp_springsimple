package com.mylab.jmp.spring.simple.beans.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.core.Ordered;

public class PostProcessor implements DestructionAwareBeanPostProcessor, Ordered {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " to be initialized");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " was initialized");
        return o;
    }

    @Override
    public int getOrder() {
        return Integer.MIN_VALUE;
    }

    @Override
    public void postProcessBeforeDestruction(Object o, String s) throws BeansException {
        System.out.println("Bean " + s + " to be DESTROYED!!! ");
    }

    @Override
    public boolean requiresDestruction(Object o) {
        return true;
    }
}
