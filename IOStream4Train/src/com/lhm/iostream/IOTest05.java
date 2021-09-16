package com.lhm.iostream;

import java.lang.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest05 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("/home/lihanmian/文档/temp");
            int readByte=fis.read();

            fis.skip(3);
            System.out.println(String.valueOf(fis.read()));

            //返回剩下的 还可以读的 字节数量
            System.out.println(fis.available());

            //用法
            byte[]b=new byte[fis.available()];
            fis.read(b);
            System.out.println(new String(b));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
