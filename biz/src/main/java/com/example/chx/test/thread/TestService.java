package com.example.chx.test.thread;

/**
 * @author: mzq
 * @date: 2018/6/21
 * @description :
 * @version: 2.0
 */
public class TestService{
     public void sayHi(String name){
        System.out.println(Thread.currentThread().getName()+" start : "+name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" end : "+name);
    }
}
