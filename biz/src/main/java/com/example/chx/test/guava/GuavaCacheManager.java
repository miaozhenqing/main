package com.example.chx.test.guava;

import com.google.common.cache.*;

import java.util.concurrent.TimeUnit;

public class GuavaCacheManager {
    public static void main(String[] args) throws Exception{
        //CacheBuilder的构造函数是私有的，只能通过其静态方法newBuilder()来获得CacheBuilder的实例
        LoadingCache<Integer,User> userCache=CacheBuilder.newBuilder()
                //设置并发级别为8，并发级别是指可以同时写缓存的线程数
                .concurrencyLevel(8)
                //设置写缓存后8秒钟过期
                .expireAfterWrite(8,TimeUnit.SECONDS)
                //设置缓存容器的初始容量为10
                .initialCapacity(10)
                //设置缓存最大容量为100，超过100之后就会按照LRU最近虽少使用算法来移除缓存项
                .maximumSize(100)
                //设置要统计缓存的命中率
                .recordStats()
                //build方法中可以指定CacheLoader，在缓存不存在时通过CacheLoader的实现自动加载缓存
                .build(new CacheLoader<Integer, User>() {
                    @Override
                    public User load(Integer key) throws Exception {
                        System.out.println("load student " + key);
                        User user = new User();
                        user.setId(key);
                        user.setName("name " + key);
                        return user;
                    }
                });

        for(int i=0;i<20;i++){
            //从缓存中得到数据，由于我们没有设置过缓存，所以需要通过CacheLoader加载缓存数据
            User user = userCache.get(1);
            System.out.println(user);
            Thread.sleep(1000);
        }

        //最后打印缓存的命中率等 情况
        System.out.println();
        System.out.println("cache stats : "+userCache.stats().toString());
    }
}
