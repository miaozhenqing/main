package com.example.chx.test.lambda;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @ClassName LambdaTest
 * @Description Predicate用来逻辑判断，Function用在有输入有输出的地方，Supplier用在无输入，有输出的地方，而Consumer用在有输入，无输出的地方
 * @Author Mzq
 * @Date 2019/1/8 16:31
 * @Version 1.0
 **/
public class LambdaTest {
    public static void main(String[] args) {
        List<String> lists=new ArrayList<String >();
        lists.add("a1");
        lists.add("a2");
        lists.add("b1");
        lists.add("b2");
        lists.add("b3");
        lists.add("o1");

        lists.stream().map(String::toUpperCase).sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);

    }
    @FunctionalInterface
    interface GreetingService{
        void sendMessage(String message);

        default void sendDefaultMsg(String name){
            System.out.println("sendDefaultMsg..."+name);
        }
        default void sendDefaultMsg2(String name){
            System.out.println("sendDefaultMsg..."+name);
        }
    }
}
