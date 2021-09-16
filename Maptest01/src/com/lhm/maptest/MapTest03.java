package com.lhm.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest03  {

    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        /**
         * 遍历方式1
         * 获取所有key，通过key获取value
         */
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");

        Set<Integer> set=map.keySet();
        Iterator<Integer>iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

        for (int k:set) {
            System.out.println(map.get(k));

        }
        /**
         * 遍历方式2,map转set
         */
        Set<Map.Entry<Integer,String>> set1=map.entrySet();
        Iterator<Map.Entry<Integer,String>>it=set1.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getKey()+it.next().getValue());
        }
    }
}
