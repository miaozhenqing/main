package com.example.chx.test.designmodel.Observer;

/**
 * @author: mzq
 * @date: 2018/7/26
 * @description :
 * @version: 2.0
 */
public class Police2 implements Police {
    @Override
    public void update(String msg) {
        System.out.println("police1 : "+msg);
    }
}
