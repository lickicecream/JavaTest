package com.lhm.threadSafe;

public class AccountThread extends Thread{

    private Account account;

    public AccountThread(Account a){
        this.account=a;
    }

    @Override
    public void run() {
        //run方法的执行表示取款操作
        double money=5000;
        this.account.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对账户"
                + this.account.getAccountNumber()
                + "取款成功，余额："
                + this.account.getBalance());
    }
}
