package com.lhm.reflect4train;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Test11 {

    public static void main(String[] args) throws  Exception{
        StringBuilder sb=new StringBuilder();
        StringBuilder delete=new StringBuilder();
        Class studentClass=Class.forName("com.lhm.reflect4train.Student");
        Constructor []constructors=studentClass.getDeclaredConstructors();
        String className=studentClass.getSimpleName();
        String modifier=Modifier.toString(studentClass.getModifiers());
        sb.append(modifier+" class "+className+"{\n");
        for(Constructor constructor:constructors){
            Class[] classes=constructor.getParameterTypes();
            sb.append("\t"+modifier+" "+className+" (");
            if(classes.length>0){
                for (Class c:classes){
                    delete.append(c.getSimpleName());
                    delete.append(",");
                }
                delete.deleteCharAt(delete.length()-1);
            }

            sb.append(delete.toString());
            sb.append("){}\n");
            delete.delete(0,delete.length());
        }
        sb.append("}");
        System.out.println(sb.toString());
    }

}
