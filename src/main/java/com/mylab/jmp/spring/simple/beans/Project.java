package com.mylab.jmp.spring.simple.beans;

import com.mylab.jmp.spring.simple.Person;

import java.util.List;

public class Project {

    private String name;
    private List<Person> staff;

    public Project() {
    }

    public Project(String name, List<Person> staff) {
        this.name = name;
        this.staff = staff;
        System.out.println(String.format("Project %s was created", name));
    }

    public void initProject() {
        System.out.println("Check budgeting for " + staff.size() + " engineers");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getStaff() {
        return staff;
    }

    public void setStaff(List<Person> staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", staff=" + staff +
                '}';
    }
}
