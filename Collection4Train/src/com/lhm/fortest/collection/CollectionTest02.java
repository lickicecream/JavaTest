package com.lhm.fortest.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 1.一下讲解的遍历方式，是所有collection的通用方式
 * 2，在map中不能使用
 * 3.Iterator it=c.iterator();
 * 4.boolean hasNext()
 * 5.Object next()
 *
 *
 * */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add(100);
        c.add(new Object());

        //进行遍历
        //1.获取集合对象的迭代器
        Iterator it = c.iterator();
        //2.迭代遍历集合
        while (it.hasNext()) {
            //不管你存的是什么，取出来统一时Object
            System.out.println(it.next().toString());
        }

    }
}

class Person {
    public Person() {

    }

    private String name;

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) && (obj instanceof Person))
            return false;
        if (obj == this) return true;
        Person p = (Person) obj;
        return p.name.equals(this.name);
    }
}
