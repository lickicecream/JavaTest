package com.lhm.threadSafe;

public class Account  {
    private String accountNumber;
    private double balance;

    public Account() {
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money){
        //以下这几行代码必须是线程排队的，不能并发
        // 一个线程把这里的代码全部执行结束之后，另一个线程才能进来
        //关键字synchronized
        /**
         * 线程同步机制的语法
         * synchronized(){
         *    //线程同步代码块 .
         *    //小括号离得数据是向但关键的，
         *    这个数据必须是多线程共享的数据，
         *    才能达到多线程排队
         *
         *    （）中写什么？
         *      那要看你你想让哪些线程同步。
         *      假设t1,t2,t3,t4,t5有五个线程，
         *      你只希望t1,t2,t3排队，4和5不需要
         *      要在（）中写一个1,2,3共享的对象，注意是对象，而这个对象对于t4 t5不共向
         *
         *      这里的共享对象是：账户对象
         *     账户对象是共享的，那么this就是账户对象
         * }
         */
        synchronized (this){
            double before=this.getBalance();

            double after=before-money;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setBalance(after);
        }

    }
}
