package com.example.chx.test.thread.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :
 * @version: 2.0
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void  test() {
        try {
            lock.lock();
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+" -- "+i);
                Thread.sleep(500);
            }
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
