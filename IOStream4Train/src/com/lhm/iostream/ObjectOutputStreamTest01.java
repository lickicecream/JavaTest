package com.lhm.iostream;

import com.lhm.bean.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 参与序列化的和反序列化的对象，必须实现Serializable接口
 *
 * Serializable接口是一个标志接口，没有代码，java虚拟机看到这个接口，
 * 可能会对这个类进行特殊待遇，java虚拟机看到这个接口后，会为该类自动生成一个序列化版本号
 *
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Student s=new Student("lhm",22);
        //序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student"));
        //序列化对象

        oos.writeObject(s);
        oos.flush();


        oos.close();
    }
}
