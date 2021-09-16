package com.lhm.iostream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符输出流
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer=null;
        try{
            writer=new FileWriter("lhm");
            writer.write("shibro");

            writer=new FileWriter("lhm",true);
            writer.write("lhm");
            writer.write("bro");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
