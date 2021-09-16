package com.lhm.iostream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader
 * 带有缓冲区的字符流，使用这个流不用自定义char或者byte数组
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        FileReader reader=null;
        BufferedReader br=null;
        try{
            reader=new FileReader("lhm");
            //当一个流的构造方法中需要一个流的时候 ，这个被传入的流叫节点流
            //外部负责包装的这个流叫做包装流，也叫处理流
            br=new BufferedReader(reader);
            String firstLine=null;

            //br.readline()方法读取一个文本行，但不带换行符
            while((firstLine=br.readLine())!=null){
                System.out.println(firstLine);
            }

            //只用关闭最外层
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
