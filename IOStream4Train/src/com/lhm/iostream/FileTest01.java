package com.lhm.iostream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类和四大流没关系，不能完成读和写
 * File对象代表什么？
 *      文件和路径名的抽象表现形式
 *      file可以是目录，也可能是文件
 */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File f1=new File("/home/lihanmian/file");
        System.out.println(f1.exists());

        //创建文件
        if(!f1.exists()){
            f1.createNewFile();
        }


        //创建多重目录
        File f2=new File("/home/lihanmian/dir/dir1/file");
        if(!f2.exists()){
            f2.mkdirs();
        }

        //获取父路径
        String parentPath=f1.getParent();
        System.out.println(parentPath);

        //获取文件名
        System.out.println(f1.getName());

        //判断是否是一个目录
        System.out.println(f1.isDirectory());


        //判断是否是一个文件
        System.out.println(f1.isFile());

        //获取最后修改时间
        System.out.println(f1.lastModified());

        long haoMiao=f1.lastModified();

        Date time=new Date(haoMiao);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime=sdf.format(time);

        System.out.println(strTime);
    }
}
