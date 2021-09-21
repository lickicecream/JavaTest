package com.lhm.threadSafe2;

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
    public synchronized void  withdraw(double money){
        /**
         * 在实例方法上使用synchronized，锁的一定是this
         *
         * 还有一个缺点：
         *      表示整个方法体都需要同步，
         *      可能胡无辜扩大同步的范围，导致程序的执行效率降低
         *
         * 优点：代码写的少，如果共享的对象就是this，并且需要的同步代码块解释整个方、建议这么使用
         */

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
