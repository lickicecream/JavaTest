package com.lhm.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student(String name,int number){
        this.name=name;
        this.number=number;
    }
}
