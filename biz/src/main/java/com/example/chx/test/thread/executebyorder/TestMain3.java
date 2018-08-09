package com.example.chx.test.thread.executebyorder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: mzq
 * @date: 2018/7/30
 * @description :三个线程按顺序执行 方法3
 * @version: 2.0
 */
public class TestMain3 {
    private static ExecutorService executor = Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws Exception{

        Thread thread1=new Thread1();
        Thread thread2=new Thread2();
        Thread thread3=new Thread3();
        executor.submit(thread1);
        executor.submit(thread2);
        executor.submit(thread3);
        executor.shutdown();

    }

}
