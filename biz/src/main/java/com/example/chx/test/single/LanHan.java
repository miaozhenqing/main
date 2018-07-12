package com.example.chx.test.single;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :单例模式 懒汉模式
 * @version: 2.0
 */
public class LanHan {
    //1、构造函数 私有
    private LanHan(){}
    //2、创建实例
    private static LanHan instance;
    //3、提供实例
    public static LanHan getInstance(){
        if(null!=instance){
        }else {
            instance=new LanHan();
        }
        return  instance;
    }
}
