package com.mylab.jmp.spring.simple.beans;

public class Project {

    private String name;
    private Developer lead;

    public Project() {
    }

    public Project(String name, Developer lead) {
        this.name = name;
        this.lead = lead;
    }

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer getLead() {
        return lead;
    }

    public void setLead(Developer lead) {
        this.lead = lead;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", lead=" + lead +
                '}';
    }
}
