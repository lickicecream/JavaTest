package com.lhm.reflect4train;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 验证反射机制灵活性，java代码协议便，再不改变java代码的情况下，可以做到不同对象的实例化，
 * 非常灵活，（符合OCP开闭原则，对扩展开放，对修改关闭）
 */
public class Test03 {
    public static void main(String[] args) {
        //这种写法就写死了
        User user=new User();

        //通过反射机制很灵活，没有写死
        FileReader reader=null;
        char[] context=new char[4];
        StringBuilder sb=new StringBuilder();
        try{
            reader=new FileReader("/home/lihanmian/IdeaProjects/Java4Train/反射机制/classinfo.properties");
            //创建属性类对象
            Properties pro=new Properties();
            //加载
            pro.load(reader);
            reader.close();


            //通过key获取value
            String className=pro.getProperty("className");
            System.out.println(className);
//            int readCount=0;
//            while((readCount=reader.read(context))!=-1){
//                sb.append(context,0,readCount);
//            }
//            System.out.println(sb.toString());
            //通过反射机制实例化对象
            Class c=Class.forName(className);
            Object obj=c.newInstance();
            System.out.println(obj.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
