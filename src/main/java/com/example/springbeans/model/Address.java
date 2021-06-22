package com.example.springbeans.model;

import java.io.Serializable;

public class Address implements Serializable {
    private String fullAddress;

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }



}
