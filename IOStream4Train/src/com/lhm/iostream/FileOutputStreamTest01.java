package com.lhm.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //这种方式会清空文件
            fos=new FileOutputStream("temp4train.txt");
            byte[] b={98,98,99};
            fos.write(b);

            //以追加的方式写入,不会清楚原文件内容
            fos=new FileOutputStream("temp4train.txt",true);
            fos.write(b);

            //写入一部分
            fos.write(b,0,1);

            //写完最后一定要刷新
            fos.flush();


            //  写入字符串
            String s=new String("shit bro");
            b=s.getBytes();
            fos.write(b);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {

                }
            }
        }

    }
}
