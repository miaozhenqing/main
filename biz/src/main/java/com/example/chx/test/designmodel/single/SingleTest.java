package com.example.chx.test.designmodel.single;

/**
 * @author: mzq
 * @date: 2018/7/26
 * @description :
 * @version: 2.0
 */
public class SingleTest {
    //饿汉
//    private static SingleTest instance=new SingleTest();
//    private SingleTest(){}
//    private static SingleTest getInstance(){
//        return instance;
//    }
//    //懒汉 线程不安全
//    private static SingleTest instance=null;
//    private SingleTest(){}
//    private static SingleTest getInstance(){
//        if(instance==null){
//            instance=new SingleTest();
//        }
//        return instance;
//    }
    //懒汉 线程安全 效率低
//    private static SingleTest instance=null;
//    private SingleTest(){}
//    private static synchronized SingleTest getInstance(){
//        if(instance==null){
//            instance=new SingleTest();
//        }
//        return instance;
//    }
//懒汉 线程安全 双重校验锁
    private static SingleTest instance=null;
    private SingleTest(){}
    private static SingleTest getInstance(){
        if(instance==null){
            synchronized (SingleTest.class){
                if(instance==null){
                    instance=new SingleTest();
                }
            }
        }
        return instance;
    }
}
