package com.example.chx.test.thread;

/**
 * @author: mzq
 * @date: 2018/6/21
 * @description :
 * @version: 2.0
 */
public class Thread1 extends Thread {
    private TestService testService;
    public Thread1(TestService testService){
        this.testService=testService;
    }
    @Override
    public void run() {
        super.run();
        testService.sayHi("tom1");
    }
}
