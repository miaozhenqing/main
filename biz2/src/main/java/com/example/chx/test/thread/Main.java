package com.example.chx.test.thread;

/**
 * @author: mzq
 * @date: 2018/6/21
 * @description :
 * @version: 2.0
 */
public class Main {
    public static void main(String[] args) {
        TestService testService=new TestService();
        Thread1 thread1=new Thread1(testService);
        thread1.setName("A");
        thread1.start();
        Thread2 thread2=new Thread2(testService);
        thread2.setName("B");
        thread2.start();
        MyRunnable myRunnable=new MyRunnable(testService);
        Thread thread3=new Thread(myRunnable);
        thread3.setName("C");
        thread3.start();
    }
}
