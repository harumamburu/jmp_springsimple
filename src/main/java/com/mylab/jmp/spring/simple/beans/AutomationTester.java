package com.mylab.jmp.spring.simple.beans;

public class AutomationTester extends Engineer {

    private String framework;
    private boolean isBro;

    public AutomationTester() {
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public boolean isBro() {
        return isBro;
    }

    public void setIsBro(boolean bro) {
        isBro = bro;
    }

    @Override
    public String toString() {
        return "AutomationTester{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", level=" + level +
                ", framework='" + framework + '\'' +
                ", isBro=" + isBro +
                '}';
    }
}
