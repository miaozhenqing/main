package com.example.chx.test.thread.lock;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :
 * @version: 2.0
 */
public class Thread1 extends Thread {
    private MyService myService;
    public Thread1(MyService myService){
        this.myService=myService;
    }

    @Override
    public void run() {
        super.run();
        myService.test();
    }

}
