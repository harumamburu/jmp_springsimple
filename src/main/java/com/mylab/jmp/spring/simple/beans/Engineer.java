package com.mylab.jmp.spring.simple.beans;

import com.mylab.jmp.spring.simple.Person;

public abstract class Engineer implements Person {

    protected String name;
    protected String skill;
    protected Integer level;

    public Engineer() {
    }

    public void engineerInit() {
        System.out.println(String.format("Engineer %s skilled in %s was hired", name, skill));
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", level=" + level +
                '}';
    }
}
