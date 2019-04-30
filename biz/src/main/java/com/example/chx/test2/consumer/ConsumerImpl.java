package com.example.chx.test2.consumer;

import java.util.function.Consumer;

/**
 * @ClassName ConsumerImpl
 * @Description TODO
 * @Author Mzq
 * @Date 2019/3/21 15:11
 * @Version 1.0
 **/
public class ConsumerImpl implements Consumer<String> {
    @Override
    public void accept(String s) {
        String ss=s+"-"+"000";
        System.out.println(ss);
    }
}
