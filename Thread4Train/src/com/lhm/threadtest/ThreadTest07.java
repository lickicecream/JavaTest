package com.lhm.threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest07 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第一步，创建一个未来任务类对象
        FutureTask task=new FutureTask(new Callable() {

            //这个call方法基本等于run方法，只不过有一个返回值
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin");
                Thread.sleep(1000);
                System.out.println("call method end!");
                return null;
            }
        });

        Thread t1=new Thread(task);

        t1.start();

        //在主线程中获取t线程的返回结果,get()方法
        //main而get（）方法可能需要很久,因为另一个线程执行是需要时间的
        Object o=task.get();
    }
}
