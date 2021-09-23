package com.lhm.reflect4train;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test06 {
    //以流的形式直接返回
    public static void main(String[] args) {

        //获取一个文件的绝对路径
        String path=Thread.currentThread().getContextClassLoader().
                getResource("classinfo2.properties").getPath();

        FileReader reader = null;
            try {
                reader = new FileReader(path);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        Properties pro=new Properties();
        try {
            pro.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(pro.getProperty("className"));
    }

}
