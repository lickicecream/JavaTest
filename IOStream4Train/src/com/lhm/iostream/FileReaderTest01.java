package com.lhm.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader 文件字符输入流，只能读去纯文本
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader reader=null;
        char[] context=new char[1024];
        try {
            //创建文件字符流
            reader = new FileReader("/home/lihanmian/文档/temp");
            //读到char数组里
            int readCount=0;

            //一样可以一段一段读
            while(( readCount=reader.read(context))!=-1){
                System.out.println(new String(context,0,readCount));
            }

            System.out.println(new String(context));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace( );
                }
            }
        }
    }
}
