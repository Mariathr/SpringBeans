package com.example.springbeans.model;

public class Developer {
    private int id;
    private String name;
    private int nbSkillYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbSkillYear() {
        return nbSkillYear;
    }

    public void setNbSkillYear(int nbSkillYear) {
        this.nbSkillYear = nbSkillYear;
    }
    @Override
    public String toString(){
        return "Name =" + this.getName() + " Years = " + this.getNbSkillYear();
    }
}


