package com.lhm.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest02 {
    public static void main(String[] args) {
        List<NewAnimal>list=new ArrayList<>();
        list.add(new NewCat());
        list.add(new NewBird());

        Iterator<NewAnimal> iterator=list.iterator();
        while(iterator.hasNext()){
            iterator.next().move();

        }
    }
}


class NewAnimal {
    void move() {
        System.out.println("动物在移动");
    }
}

class NewCat extends NewAnimal{
    void  catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class NewBird extends NewAnimal{
    void fly(){
        System.out.println("bird is flying");
    }
}