package com.lhm.threadtest;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用wait方法和notify方法实现生产者和消费者模式
 * 什么是生产者和消费者模式
 * 生产线程负责生产，消费线程负责消费
 * <p>
 * 生产线成和消费线程要达到均衡
 * 这是一种特殊的业务需求，在这种特殊的情况下要使用wit和notify方法
 * <p>
 * wait和notify方法不是线程对象的方法，是普通java对象都有的方法
 * <p>
 * wait notify都建立在线成同步 synchornized 的基础上，因为多线程要同时操作一个仓库，有线程安全问题
 * <p>
 * wait方法作用：o.wait()让正在o对象上获取的线程t进入等待状态，并且释放调t线程之前占有的o对象锁
 * <p>
 * 7
 */

public class ThreadTest08 {
    public static void main(String[] args) {
        List list = new ArrayList();


        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();
    }
}


//生产线程
class Producer implements Runnable {

    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    try {
                        //当前线程进入等待状态，并且释放Producer之前占有的list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //程序能执行到这里说明仓库是空的，可以生产
                Object obj=new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"---->"+obj.toString());
                //唤醒消费者进行消费
                list.notify();

            }
        }
    }
}


//消费线程

class Consumer implements Runnable {

    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if(list.size()==0){
                    try {
                        //仓库空了，消费者线程等待，释放掉list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到此处，说明仓库中有数据，进行消费
                Object o=list.remove(0);
                System.out.println(Thread.currentThread().getName()+"---->"+o);
                //唤醒生产者生产
                list.notify();
            }
        }
    }
}