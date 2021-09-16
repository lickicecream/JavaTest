package com.lhm.list;

public class GenericTest03 <K> {
    public static void main(String[] args) {

        //new对象时，指定了泛型为String类型
        GenericTest03<String> gt=new GenericTest03<>();
        gt.doSome("shit bro");
    }

    public void doSome(K o){
        System.out.println(o.toString());
    }

    MyClass<String> myClass=new MyClass<>();
    String str=myClass.get();


}

class MyClass<T>{
    public T get(){
        return null;
    }
}
