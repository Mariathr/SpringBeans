package com.example.springbeans.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class Customer1 implements Serializable {
    private String action;
    private int type;
    @Autowired
    private Person person;

    public Customer1(String action, int type,   Person person) {
        this.action = action;
        this.type = type;
        this.person = person;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString(){
        return "Action = " + getAction() + ", Type = " + getType() +", " + getPerson().toString();
    }
}
