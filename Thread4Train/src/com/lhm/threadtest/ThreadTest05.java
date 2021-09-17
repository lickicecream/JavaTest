package com.lhm.threadtest;

public class ThreadTest05 {
    public static void main(String[] args) {
        System.out.println("main begin");

        Thread t=new Thread(new MyRunnable03());

        t.setName("t");
        t.start();

        //合并线程
        try {
            t.join();//t合并到当前线程中，当前线程阻塞，t线程执行到结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");

    }


}


class MyRunnable03 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}