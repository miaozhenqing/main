package com.example.chx.test2.consumer;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @ClassName TestConsumer
 * 测试Consumer
 * @Author Mzq
 * @Date 2019/3/21 15:09
 * @Version 1.0
 **/
public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer=new ConsumerImpl();
        consumer.accept("hello");
    }
}
