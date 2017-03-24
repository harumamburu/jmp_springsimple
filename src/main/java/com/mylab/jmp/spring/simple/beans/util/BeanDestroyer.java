package com.mylab.jmp.spring.simple.beans.util;

import org.springframework.beans.factory.DisposableBean;

public class BeanDestroyer implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanDestroyer go team!");
    }
}
