package com.lhm.callback;

public class Bird {
    private String name;
    private int age;

    public void fly(FlyInterface flyInterface){
        flyInterface.fly();
    }
}
