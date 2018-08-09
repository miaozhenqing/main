package com.example.chx.test.designmodel.Observer;

/**
 * @author: mzq
 * @date: 2018/7/26
 * @description :
 * @version: 2.0
 */
public interface BadGuys {
    void add(Police police);
    void remove(Police police);
    void notice(String police);
}
