package com.example.chx.test.designmodel.observer2;

/**
 * @author: mzq
 * @date: 2018/8/9
 * @description :
 * @version: 2.0
 */
public class TestClient {
    public static void main(String[] args) {
        Watcher watcher=new Watcher();
        Wechat wechat=new Wechat();
        wechat.add(watcher);
        wechat.notice("hello world");
    }
}
