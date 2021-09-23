package com.lhm.reflect4train;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        //接下来说一种比较通用的路径，即使代码位置换了，这样编写路径仍然是通用的
        //注意：使用以下通用方式的前提是，这个文件必须在类路径下
        //凡是在src下的都叫类路径下

        //getContextClassLoader()是线程对象的方法，可以获取到当前线程的类加载器对象。
        //getResource（） ，获取资源，这是类加载器的方法，当前线程的泪的加载器默认是从跟路径下加载资源
        String path=Thread.currentThread().getContextClassLoader().
                getResource("classinfo2.properties").getPath();

        //采用以上代码可以拿到一个文件的绝对路径。
        //无论是什么操作系统都是通用的
        System.out.println(path);
        String path2=Thread.currentThread().getContextClassLoader().
                getResource("/com/lhm/reflect4train/Test01.java").getPath();
        System.out.println(path2);
    }
}
