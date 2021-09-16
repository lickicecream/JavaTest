package com.lhm.maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"lhm");
        map.put(2,"zhangsan");
        map.put(3,"zhaosi");
        map.put(4,"wangwu");

        String values=map.get(4);
        map.size();

        map.containsKey(4);
        map.containsValue("zhaosi");

        Collection<String> collection=map.values();

    }
}
