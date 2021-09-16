package com.lhm.threadtest;

/**
 *
 * 获取线程名称 setNAme（），getName（）
 *
 * 获取当前线程Thread.currentThread()，返回值是Thread
 * 代码出现在main方法中，当前线程就是主线程
 *
 * 静态方法 Thread.sleep(1000);
 * 参数是毫秒
 * 作用是让当前进程进入休眠状态。进入阻塞状态，把cpu让给其他程序
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread01 t=new MyThread01();
        t.start();


    }
}

class MyThread01 extends Thread {
    @Override
    public void run() {
        try {
            for (int i=0;i<1000;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
//            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
