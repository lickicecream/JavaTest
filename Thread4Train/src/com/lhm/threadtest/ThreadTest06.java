package com.lhm.threadtest;

public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t1=new BakDataThread();
        t1.setName("数据备份线程");
        t1.setDaemon(true);//设置为守护线程
        t1.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"----->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakDataThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while(true){
            System.out.println(Thread.currentThread().getName()+"----->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}