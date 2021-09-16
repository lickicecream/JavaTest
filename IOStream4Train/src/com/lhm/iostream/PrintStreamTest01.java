package com.lhm.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream,标准字节输出流。默认输出到控制台
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception {
        PrintStream ps=System.out;
        ps.println();

        //标准输出流不需要手动关闭
        //可以改变输出流的方向,输出到日志文件

        PrintStream printStream=new PrintStream(new FileOutputStream("log"));
        System.setOut(printStream);


        System.out.println("hello world");
    }
}
