package com.lhm.threadtest;

public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t=new Thread(new MyThread02());
        t.setName("t");
        t.start();

        try {
            MyThread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();

    }
}

class MyThread02 implements Runnable{
    @Override
    public void run() {
        System.out.println(MyThread.currentThread().getName()+"---->begin");

        try {
            MyThread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(MyThread.currentThread().getName()+"--->end");
    }
}
