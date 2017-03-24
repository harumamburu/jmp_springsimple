package com.mylab.jmp.spring.simple.beans;

import com.mylab.jmp.spring.simple.Person;

import java.util.Set;

public class Manager implements Person {

    private String name;
    private Integer emailPerHour;
    private Set<Engineer> pool;

    public Manager() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmailPerHour() {
        return emailPerHour;
    }

    public void setEmailPerHour(Integer emailPerHour) {
        this.emailPerHour = emailPerHour;
    }

    public Set<Engineer> getPool() {
        return pool;
    }

    public void setPool(Set<Engineer> pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", emailPerHour=" + emailPerHour +
                ", pool=" + pool +
                '}';
    }
}
