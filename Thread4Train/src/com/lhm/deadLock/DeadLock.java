package com.lhm.deadLock;

public class DeadLock {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        //t1,t2两个线程共享o1,o2
        Thread t1=new MyThread01(o1,o2);
        Thread t2=new MyThread02(o1,o2);
    }
}

class MyThread01 extends Thread{
    Object o1;
    Object o2;

    public MyThread01(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}


class MyThread02 extends  Thread{
    Object o1;
    Object o2;

    public MyThread02(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}