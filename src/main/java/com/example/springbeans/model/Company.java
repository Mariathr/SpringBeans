package com.example.springbeans.model;

public class Company {
    private String name;
    private Developer devJava;
    private String projectManager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public Developer getDevJava() {
        return devJava;
    }

    public void setDevJava(Developer devJava) {
        this.devJava = devJava;
    }
}
