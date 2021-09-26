package com.lhm.reflect4train;

/*
    可变长参数 语法：类型...
    可变长参数必须在参数列表中最后一个位置上，并且只能有一个
    可变长度参数可以当成一个数组
 */
public class ArgTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,10,10,10);
        m1("aa","bb","cc");
    }

    public static void m(int... args){
        System.out.println("m执行了");
    }

    public static void m1(String... args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
