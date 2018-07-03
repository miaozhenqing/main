package com.example.chx.test.hashmap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :三种线程安全hashMap实现
 * @version: 2.0
 */
public class SafeHashMap {
    public static void main(String[] args) {
        //普通hashmap，线程不安全
        Map<String,String> map=new HashMap();
        //以下线程安全
        Map<String,String> hashTable=new Hashtable<>();

        Map<String,String> concurrentMap= new ConcurrentHashMap<>();

        Map<String,String> synchronizedHashMap= Collections.synchronizedMap(new HashMap<>());
    }

}
