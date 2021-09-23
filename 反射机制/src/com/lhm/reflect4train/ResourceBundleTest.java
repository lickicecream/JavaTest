package com.lhm.reflect4train;

import java.util.ResourceBundle;

/**
 * java.util包下提供了一个资源绑定器，获取属性配置文件中的内容
 * 使用以下这种方式中，属性配置文件必xxx .properties必须放在类路径下
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //资源绑定器智能绑定xxx.properties
        //并且再写路径的时候，不能写扩展民
        ResourceBundle bundle=ResourceBundle.getBundle("classinfo2");

        String className=bundle.getString("className");

        ResourceBundle bundle1=ResourceBundle.getBundle("com/lhm/reflect4train/bd");

        String className1=bundle1.getString("className");
        System.out.println(className1);
    }
}
