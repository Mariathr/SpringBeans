package com.example.springbeans.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

//@Scope("singleton")
public class Service {
    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return  "Message = " + this.message ;
    }
}
