package com.example.chx.test.designmodel.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: mzq
 * @date: 2018/8/9
 * @description :
 * @version: 2.0
 */
public class Wechat implements Observerable {
    private List<Observer> list=new ArrayList<>();
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void del(Observer observer) {
        if(!list.isEmpty()){
            list.remove(observer);
        }
    }

    @Override
    public void notice(String msg) {
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(msg);
        }
    }
}
