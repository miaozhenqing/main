package com.example.chx.test.jvm;

/**
 * @author: mzq
 * @date: 2018/7/4
 * @description :虚拟机栈溢出
 * @version: 2.0
 */
public class ZhanOutOfMemory {
    public static void main(String[] args) {
        Test test=new Test();
        test.doSomething();
    }

    static class  Test{
        public void doSomething(){
            doSomething();
        }
    }
}
