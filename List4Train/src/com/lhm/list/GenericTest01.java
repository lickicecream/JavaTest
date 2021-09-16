package com.lhm.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {

        List myList=new ArrayList();

        Cat c=new Cat();
        Bird  b=new Bird();


        myList.add(c);
        myList.add(b);

        Iterator iterator =myList.iterator();
        while(iterator.hasNext()){
            Object o=iterator.next();
            if(o instanceof Cat){
                ((Cat)o).catchMouse();
                ((Cat) o).move();
            }else if(o instanceof Bird){
                ((Bird) o).fly();
            }
        }
    }
}

class Animal{
    void move(){
        System.out.println("动物在移动");
    }
}

 class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟在飞");
    }

}