package com.example.chx.test.readandwritelock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :读写锁
 * @version: 2.0
 */
public class ReadAndWriteLock {
    Map<String,String> map=new HashMap<>();
    private ReentrantReadWriteLock reentrantLock=new ReentrantReadWriteLock();
    private Lock write = reentrantLock.writeLock();
    private Lock read = reentrantLock.readLock();

    public String get(String key){
        read.lock();
        String res=null;
        try {
            res = map.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            read.unlock();
        }
        return res;
    }
    public void set(String key,String value){
        write.lock();
        try {
            map.put(key,value);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            write.unlock();
        }
    }
    public void test(){
        ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    }
}
