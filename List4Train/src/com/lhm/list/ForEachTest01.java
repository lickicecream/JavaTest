package com.lhm.list;

import java.util.ArrayList;
import java.util.List;

public class ForEachTest01 {


    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6};
        for (int num:a) {
            System.out.println(num);
        }

        List<String>list=new ArrayList<>();
        list.add("mf");
        list.add("shit bro");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for (String str:list) {
            System.out.println(str);
        }
    }
}
