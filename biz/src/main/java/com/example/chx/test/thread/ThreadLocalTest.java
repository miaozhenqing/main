package com.example.chx.test.thread;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :ThreadLocalTest 用法
 * @version: 2.0
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    Tools.tl.set(Thread.currentThread().getName()+" setValue:"+Thread.currentThread().getName()+i);
                    System.out.println(Thread.currentThread().getName()+" getValue:"+Thread.currentThread().getName());
                }

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<50;i++){
                    Tools.tl.set(Thread.currentThread().getName()+" setValue:"+Thread.currentThread().getName()+i);
                    System.out.println(Thread.currentThread().getName()+" getValue:"+Thread.currentThread().getName());
                }
            }
        });
        thread1.start();
        thread2.start();
    }



    static class Tools{
        static ThreadLocal tl=new ThreadLocal();
    }
}
