package com.lhm.reflect4train;

/**
 * 获取属性Field
 */

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass=Class.forName("com.lhm.reflect4train.Student");
        //获取所有public修饰的属性
//        Field[] fields=studentClass.getFields();

        //获取所有属性
        Field[]fields=studentClass.getDeclaredFields();
        System.out.println(fields.length);
        for (Field filed:fields) {
            System.out.print(filed.getName()+"===");
            System.out.print(Modifier.toString(filed.getModifiers())+"====");//每个修饰服饰一个数字，数字是修饰符的代号
            System.out.println(filed.getType().getSimpleName());
        }
    }
}
