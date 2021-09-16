package com.lhm.fortest.collection;

/*
* collectionc<E>常用方法
* 1.如果不加泛型,collection可以存储Object的所有子类型
* 2.集合中不能直接存储基本数据类型，也不能存java对象，存的只是引用
* collection常用方法
*   1.boolean add（Object e）,向集合中添加元素
*   2.int size();
*   3.void clear();//移除所有元素
*   4.boolean contains();//如果包含指定元素，返回true
*   5.boolean remove();
*   6.boolean isEmpty();
*   7.object[] toArray();把集合转换为数组
* */


import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(1200);//自动装箱 Integer X =new Integer（1200）;
        c.add("mnb");
        c.add(true);

        c.contains(1200);

    }

}
