package com.lhm.threadtest;

public class ThreadTest04  {
    public static void main(String[] args) {
        MyRunnable01 mr=new MyRunnable01();
        Thread t=new Thread(mr);
        t.setName("lhm");
        t.start();

        try {
            MyThread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mr.run=false;

    }
}

class MyRunnable01 implements Runnable{

    public boolean run=true;
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            if(run){
                System.out.println(MyThread.currentThread().getName()+"--->"+i);
                try {
                    MyThread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }
    }
}
