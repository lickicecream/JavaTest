package com.lhm.reflect4train;

//反射属性Field
public class Student {
    //Field翻译为字段，其实就是属性
    //4个field，分别采用了不同的访问控制权修饰符
    public int no; //这整个是一个field对象
    private String name;
    protected int age;
    boolean sex;
    public static final double PI=3.1415926;


    public Student() {
    }

    public Student(int no) {
        this.no = no;
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public Student(int no, String name, int age, boolean sex) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
