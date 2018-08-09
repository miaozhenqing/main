package com.example.chx.test.thread.executebyorder;

/**
 * @author: mzq
 * @date: 2018/7/30
 * @description :三个线程按顺序执行 方法2
 * @version: 2.0
 */
public class TestMain2 {
    public static void main(String[] args) throws Exception{
        Thread thread1=new Thread1();
        Thread thread2=new Thread2();
        Thread thread3=new Thread3();

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
    }

}
