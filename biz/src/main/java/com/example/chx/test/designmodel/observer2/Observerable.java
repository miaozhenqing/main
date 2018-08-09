package com.example.chx.test.designmodel.observer2;

/**
 * @author: mzq
 * @date: 2018/8/9
 * @description :被观察者接口：添加、删除、通知观察者
 * @version: 2.0
 */
public interface Observerable {
    void add(Observer observer);
    void del(Observer observer);
    void notice(String msg);
}
