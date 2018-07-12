package com.example.chx.test.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :
 * @version: 2.0
 */
public class CglibHandler implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(">>>>>>>>>>>>>>开始");
        methodProxy.invokeSuper(o,objects);
        System.out.println(">>>>>>>>>>>>>>结束");
        return o;
    }
}
