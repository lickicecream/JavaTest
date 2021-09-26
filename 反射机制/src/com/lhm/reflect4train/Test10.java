package com.lhm.reflect4train;

import java.lang.reflect.Method;

/*
重点：必须掌握，通过反射机制怎么调用一个对象的方法？
要素分析：
    要素1：对象userService;
    login方法名
    实参列表
    返回值
 */
public class Test10 {
    public static void main(String[] args) throws Exception {
//        new UserServices().login("lhm","123");
        Class c=Class.forName("com.lhm.reflect4train.UserServices");

        Object obj=c.newInstance();

        Method loginMethod=c.getDeclaredMethod("login", String.class, String.class);
        Object returnValue=loginMethod.invoke(obj,"admin","123");
        System.out.println(returnValue);

    }

}
