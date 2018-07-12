package com.example.chx.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :动态代理
 * @version: 2.0
 */
public class UserServiceProxyHandler implements InvocationHandler {
    private Object targetObject;
    public UserServiceProxyHandler(Object targetObject){
        this.targetObject=targetObject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>开始");
        method.invoke(targetObject,args);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>结束");
        return null;
    }
}
