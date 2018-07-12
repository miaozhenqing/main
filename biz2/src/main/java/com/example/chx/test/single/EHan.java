package com.example.chx.test.single;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :单例模式 饿汉
 * @version: 2.0
 */
public class EHan {
    //1、构造函数 私有
    private EHan(){}
    //2、创建实例
    private static EHan instance=new EHan();
    //3、提供实例
    public static EHan getInstance(){
        return  instance;
    }
}
