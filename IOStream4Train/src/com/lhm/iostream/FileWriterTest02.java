package com.lhm.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileWriter和FileReader拷贝
 */
public class FileWriterTest02 {
    public static void main(String[] args) {
        FileWriter writer=null;
        FileReader reader=null;
        try{
            writer=new FileWriter("newTest.txt");
            reader=new FileReader("temp4train.txt");
            char[]c=new char[1024];
            int readcount=0;
            while((readcount=reader.read(c))!=-1) {
                writer.write(c, 0, readcount);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
