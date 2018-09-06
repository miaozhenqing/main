package com.example.chx.test.innerclass;

/**
 * @author: mzq
 * @date: 2018/8/17
 * @description :
 * @version: 2.0
 */
public class Client {
    public static void main(String[] args) {
        //成员内部类
        OutClass outClass=new OutClass();
        OutClass.InClass inClass= outClass.new InClass();
        outClass.say();
    }
}
