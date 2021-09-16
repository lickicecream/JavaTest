package com.lhm.threadtest;

/**
 * 进程A和进程B内存独立不共享
 *
 * 线程A和B，堆内存和方法区内存会共享
 * 但是栈内存独立，一个进程一个栈
 *
 * 火车站可以看成一个进程，每个窗口可以看成一个线程
 *
 *
 * java中,实现线程有两种方式
 *  1.编写一个类，直接继承java.lang.Thread,重写run方法
 *  调用的时候调用start的方法
 *
 *  2.编写一个类，实现java。lang。runnable接口,在主线程里新建Thread类，将编写的类实例化以后作为参数传入
 *
 *
 *  3.第三种方式，采用匿名内部类的方法
 */

public class ThreadTest01 {
    public static void main(String[] args) {
//        System.out.println("main begin");

        MyThread myThread=new MyThread();
        myThread.start();
        //作用：启动一个分支线程在jvm中开辟一个新的栈空间
        //这段代码任务完成之后，瞬间就结束了，只要栈空间开辟出来，start方法就结束了
        //启动成功的线程会自动调用run方法，run方法在分支栈的栈底部（压栈）
        //main方法在主栈的栈底部，run和main是平齐的
        for(int i=0;i<1000;i++){
            System.out.println("主线程--"+i);
        }

        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }


}

class MyThread extends Thread{
    @Override
    public void run() {
        //编写逻辑，这段程序运行在分支线程中
        for (int i=0;i<1000;i++){
            System.out.println("分支线程--"+i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {

    }
}
