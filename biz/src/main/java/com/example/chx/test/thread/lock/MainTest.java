package com.example.chx.test.thread.lock;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :
 * @version: 2.0
 */
public class MainTest {
    public static void main(String[] args) {
        MyService myService=new MyService();
        Thread1 thread1=new Thread1(myService);
        Thread2 thread2=new Thread2(myService);

        thread1.start();
        thread2.start();
    }
}
