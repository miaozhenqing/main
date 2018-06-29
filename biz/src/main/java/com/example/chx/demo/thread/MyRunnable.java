package com.example.chx.demo.thread;

/**
 * @author: mzq
 * @date: 2018/6/21
 * @description :
 * @version: 2.0
 */
public class MyRunnable implements Runnable {
    private TestService testService;
    public MyRunnable(TestService testService){
        this.testService=testService;
    }
    @Override
    public void run() {
        testService.sayHi("runnable");
    }
}
