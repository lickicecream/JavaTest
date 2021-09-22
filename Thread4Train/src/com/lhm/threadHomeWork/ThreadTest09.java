package com.lhm.threadHomeWork;

public class ThreadTest09 {
    public static void main(String[] args) {
        Number number=new Number();
        number.i=1;

        Thread t1=new Thread(new Producer(number));
        Thread t2=new Thread(new Consumer(number));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }
}

class Producer implements Runnable{

    Number number;

    public Producer(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        while(true){
            synchronized (number){
                if(number.i%2==0){
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+number.i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                number.i++;
                number.notify();
            }
        }
    }
}

class Consumer implements Runnable{

    Number number;

    public Consumer(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        while(true){
            synchronized (number){
                if(number.i%2==1){
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+number.i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                number.i++;
                number.notify();
            }
        }

    }
}

class Number{
    int i;
}
