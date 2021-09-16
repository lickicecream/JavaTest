package com.lhm.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1.按方向，从硬盘去内存叫做输入（input），或者叫读（read）
 * 相反叫输出（output），或者叫写（write）
 * <p>
 * 3.或者分为字节流或者字符流
 * 字符流只能读写纯文本，一次一个字符
 * a中国bc张三fe
 * 第一次读‘a’。（a占一个字节）
 * 第二次读'中'（中占两个字节）
 * <p>
 * <p>
 * 字节流什么都能读写，一次一个字节
 * 第一次读‘a’
 * 第二次读‘中’的一半
 * 第三次读另一半
 * <p>
 * 4.四个抽象类
 * InputStream 字节输入流
 * OutputStream 字节输出流
 * 以Stream结尾都是字节流
 * <p>
 * Reader 字符输入流
 * Writer 字符输出流
 * 以writer或者reader结尾都是字符流
 * <p>
 * 5.所有流都实现了java.io.Closeable接口，都是可关闭的，都有close（）方法
 * <p>
 * 6.所有输出流都实现了：
 * java.io.Flushable接口，都是可刷新的，都有flush（）方法
 * 输出流在最终输出后，一定要flush（）一下
 * 作用就是将管道中剩余的数据强行输出完，清空管道，如果没有flush（）可能会导致数据丢失
 * <p>
 * 7.java.io包下需要掌握的流有16个
 * <p>
 * 文件专属：
 * java.io.FileInputStream
 * .FileOutputStream
 * .FileReader
 * .FileWriter
 * <p>
 * 转换流，将字节流转换成字符流
 * ，InputStreamReader
 * .OutputStreamWriter
 * <p>
 * 数据流：
 * DataInPutStream
 * DataOutputStream
 * <p>
 * 标准输出流：
 * printWriter
 * printStream
 * <p>
 * 对象专属流：
 * ObjectInputStream
 * ObjectOutputStream
 */

public class IOTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/lihanmian/文档/temp");
            int readData=0;
            while((readData=fis.read())!=-1){
                System.out.println((char) readData);
            }

            //
            //读到文件末尾，就范会负一0
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //确保流一定关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
