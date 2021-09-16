package com.lhm.list;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List myList=new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add("A");
        myList.add("B");
        myList.add(1,"King");
        myList.add(myList.size() ,"lhm");

        Iterator it=myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
//        System.out.println(myList.get(3).toString());
//        System.out.println("--------------");
//        for(Object o:myList){
//            System.out.println(o);
//        }
    }
}
