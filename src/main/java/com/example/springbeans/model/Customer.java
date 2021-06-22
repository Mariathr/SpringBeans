package com.example.springbeans.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private Address firstAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getFirstAddress() {
        return firstAddress;
    }

    public void setFirstAddress(Address firstAddress) {
        this.firstAddress = firstAddress;
    }
}
