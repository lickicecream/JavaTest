package com.lhm.reflect4train;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反编译,看一下反射机制的威力
 */
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder sb=new StringBuilder();
        Class studentClass=Class.forName("java.lang.String");
        sb.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+"{ \n");
        Field []fields=studentClass.getDeclaredFields();
        for (Field field:fields) {

            String modifier=Modifier.toString(field.getModifiers());
            String fieldName=field.getName();
            String type=field.getType().getSimpleName();
//            System.out.println(modifier+" "+type+" "+fieldName);
            sb.append("\t");
            sb.append(modifier+" "+type+" "+fieldName+";");
            sb.append("\n");
        }
        sb.append("}");
        System.out.println(sb.toString());
    }

}
