package com.mylab.jmp.spring.simple.beans;

import java.util.Map;

public class Developer extends Engineer {

    private Map<String, Integer> frameworksExperience;
    private boolean isCoffeeConsumer;

    public Developer() {
        System.out.println("A dev-hero was born!");
    }

    public Map<String, Integer> getFrameworksExperience() {
        return frameworksExperience;
    }

    public void setFrameworksExperience(Map<String, Integer> frameworksExperience) {
        this.frameworksExperience = frameworksExperience;
    }

    public boolean isCoffeeConsumer() {
        return isCoffeeConsumer;
    }

    public void setIsCoffeeConsumer(boolean coffeeConsumer) {
        isCoffeeConsumer = coffeeConsumer;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", level=" + level +
                ", frameworksExperience=" + frameworksExperience +
                ", isCoffeeConsumer=" + isCoffeeConsumer +
                '}';
    }
}
