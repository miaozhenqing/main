package com.example.chx.test.thread.executebyorder;

/**
 * @author: mzq
 * @date: 2018/7/30
 * @description :
 * @version: 2.0
 */
public class Thread3 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
//            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("thread3");
    }
}
