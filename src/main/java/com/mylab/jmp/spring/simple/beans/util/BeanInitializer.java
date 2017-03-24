package com.mylab.jmp.spring.simple.beans.util;

import org.springframework.beans.factory.InitializingBean;

public class BeanInitializer implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanInitializer: after Properties Set");
    }
}
