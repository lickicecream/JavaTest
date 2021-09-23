package com.lhm.reflect4train;

/**
 * 获取class对象有什么用
 */
public class Test02 {
    public static void main(String[] args)  {

        //通过反射机制创建实例对象
        try{
            //通过反射机制，获取class，通过class实例化对象
            Class c=Class.forName("com.lhm.reflect4train.User");
            //带泛型的反射获取class
            Class<User> userClass=(Class<User>) Class.forName("com.lhm.reflect4train.User");
            //newInstance（），这个方法毁掉用User的无参构造方法，完成对象的创建
            //所以必须保证类的无参构造方法存在
            Object o=c.newInstance();

            System.out.println(o);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//        System.out.println();
    }
}
