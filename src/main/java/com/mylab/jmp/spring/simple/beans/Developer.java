package com.mylab.jmp.spring.simple.beans;

public class Developer {

    private String name;
    private String skill;
    private Integer level;
    private boolean isCoffeeConsumer;

    public Developer() {
    }

    public Developer(String name, String skill, Integer level, boolean isCoffeeConsumer) {
        this.name = name;
        this.skill = skill;
        this.level = level;
        this.isCoffeeConsumer = isCoffeeConsumer;
    }

    public Developer(String name) {
        this.name = name;
    }

    public Developer(Integer level) {
        this.level = level;
    }

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

    public boolean isCoffeeConsumer() {
        return isCoffeeConsumer;
    }

    public void setCoffeeConsumer(boolean coffeeConsumer) {
        isCoffeeConsumer = coffeeConsumer;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", level=" + level +
                ", isCoffeeConsumer=" + isCoffeeConsumer +
                '}';
    }
}
