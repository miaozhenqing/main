package com.example.chx.test.designmodel.observer2;

/**
 * @author: mzq
 * @date: 2018/8/9
 * @description :
 * @version: 2.0
 */
public class Watcher implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("我收到信息："+msg);
    }
}
