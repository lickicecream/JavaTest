package com.lhm.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest04  {
    public static void main(String[] args) {
        FileInputStream fis=null;
        byte b[]=new byte[1024];
        //准备一个byte数组
        int readLength=0;
        StringBuilder sb=new StringBuilder();
        try{
            fis=new FileInputStream("/home/lihanmian/文档/temp");
            while((readLength=fis.read(b))!=-1){
                //把byte数组转换成字符串，读到几个转几个
                String str=new String(b,0,readLength);
                sb.append(str);
            }
            System.out.println(sb.toString());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fis!=null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
