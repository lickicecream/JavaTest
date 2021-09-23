package com.lhm.reflect4train;

/**
 * 反射机制
 * 通过反射机制可以操作字节吗文件，可以读和写字节码文件
 *
 * 反射机制的相关类在哪个包下
 * java.lang,reflect
 *
 * 反射机制的相关类有哪些
 *  java.lang.Class 代表字节吗文件，代表真个字节码
 *  java.lang.Method 代表字节码中的方法字节码
 *  java.lang.reflect.Field  代表字节码中的属性字节码（成员变量）
 *  java.lang.Constructor 代表构造方法字节码
 *
 *
 *  怎么获取java.lang.Class实例
 *  如下：
 *      1.Class.forName();
 *      返回一个class类型
 *      2.Class c=引用.getClass();
 *      3.java语言中任何一种类型，包括基本数据类型，都有他的.class属性
 */
public class Test01 {
    public static void main(String[] args) {
        Class c1=null;
        try {
            c1=Class.forName("java.lang.String");
            Class c2=Class.forName("java.util.Date");
            Class c3=Class.forName("java.lang.Integer");
            Class c4=Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
             e.printStackTrace();
        }

        //java中任何一个对象都有一个方法getClass（）
        String s="abc";
        Class x=s.getClass();
        System.out.println(c1==x);
    }
}

class Person{
    private  String name;

    public String getName(){
        return this.name;
    }
}

class Man extends Person{
    @Override
    public String getName() {
        return "abc";
    }
}