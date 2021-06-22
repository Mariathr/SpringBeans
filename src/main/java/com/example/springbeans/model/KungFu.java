package com.example.springbeans.model;

import java.io.Serializable;

public class KungFu implements Serializable {
    private String name;

    public KungFu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
