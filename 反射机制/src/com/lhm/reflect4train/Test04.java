package com.lhm.reflect4train;

/**
 * 研究一下forName()发生了什么
 * 重点：
 *  如果你只是希望一个类的静态代码块执行，其他一律不执行，
 *  你可以使用：
 *  Class.forName("完整类名");
 *
 */
public class Test04 {
    public static void main(String[] args) {
        try {
            Class.forName("com.lhm.reflect4train.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class MyClass{
    //静态代码块只在类加载时执行，并且只执行一次
    static {
        System.out.println("静态代码块执行了");
    }
}