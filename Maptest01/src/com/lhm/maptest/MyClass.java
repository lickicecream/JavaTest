package com.lhm.maptest;

import java.util.HashSet;
import java.util.Set;

public class MyClass {
    public static class InnerClass{
        //静态方法
        public static void m1(){
            System.out.println("静态内部类的m1方法执行");
        }

        //实例方法
        public void m2(){
            System.out.println("静态内部类的m2方法执行");

        }
    }

    public static void main(String[] args) {
        MyClass.InnerClass.m1();
        MyClass.InnerClass innerClass=new MyClass.InnerClass();
        innerClass.m2();

        Set<MyClass.InnerClass>set=new HashSet<>();
    }
}

class Person{

}
