package com.example.springbeans.model;

import java.io.Serializable;

public class Panda implements Serializable {
    KungFu objKungfu;


    public Panda(KungFu objKungfu) {
        this.objKungfu = objKungfu;
    }

    public KungFu getObjKungfu() {
        return objKungfu;
    }


}
