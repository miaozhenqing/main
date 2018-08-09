package com.example.chx.test.designmodel.Observer;

/**
 * @author: mzq
 * @date: 2018/7/26
 * @description :
 * @version: 2.0
 */
public class TestMain {
    public static void main(String[] args) {
        Bad1 bad1=new Bad1();
        Police police1=new Police1();
        Police police2=new Police2();
        bad1.add(police1);
        bad1.add(police2);
        bad1.notice("catch me");
    }
}
