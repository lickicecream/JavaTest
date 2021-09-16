package com.lhm.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * int read(byte[] b)
 * 一次最多读b.length()个字节
 * 减少硬盘和内存的交互，提高执行效率
 */
public class IOTest03  {
    public static void main(String[] args) {
        FileInputStream fis=null;
        int readLength=0;
        StringBuilder sb=new StringBuilder();

        //准备一个4字节的数组，一次最多读取4个字节
        byte[] b=new byte[4];
        try {
            fis=new FileInputStream("/home/lihanmian/文档/temp");
            //返回值，返回到读取到的字节数量
            while((readLength=fis.read(b))!=-1){
                String str=new String(b,0,readLength);
                System.out.println(str);
                sb.append(str);
            }

            System.out.println(sb.toString());

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
