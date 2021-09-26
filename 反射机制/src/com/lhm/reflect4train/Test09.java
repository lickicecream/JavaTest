package com.lhm.reflect4train;

import java.lang.reflect.Field;

/**
 * 怎么通过反射机制访问一个java对象的属性
 * 给属性赋值set
 * 获取属性的值get
 */
public class Test09 {
    public static void main(String[] args) throws Exception {
        Class <Student>c= (Class<Student>) Class.forName("com.lhm.reflect4train.Student");
        Student student=c.newInstance();

        //获取no属性
        Field noField=c.getDeclaredField("no");

        //gei no赋值
        noField.set(student,111);

        /**
         * 虽然是永乐反射机制
         * 要素1 obj对象
         * no属性
         * 111值
         */
        System.out.println(noField.get(student));
        //以上都是为了理解以后的框架

        //可以访问私有属性吗
        Field nameField=c.getDeclaredField("name");

        //破坏封装来读取数据
        nameField.setAccessible(true);

        nameField.set(student,"lhm");

        System.out.println(nameField.get(student));
    }
}
