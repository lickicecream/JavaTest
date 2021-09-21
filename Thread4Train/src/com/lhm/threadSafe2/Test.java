package com.lhm.threadSafe2;

public class Test  {
    public static void main(String[] args) {
        Account account=new Account("act-001",10000);
        Thread t1=new AccountThread(account);
        Thread t2=new AccountThread(account);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}



