package com.example.chx.calltest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName NetSession
 * @Description TODO
 * @Author Mzq
 * @Date 2019/1/15 15:35
 * @Version 1.0
 **/
public class NetSession {
    public <T> T newOutputProxy(final Class<T> clazz){
        @SuppressWarnings("unchecked")
        T f = (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[] { clazz},
                new RemoteInvocationHandler<T>());
        return f;
    }

    class RemoteInvocationHandler<T> implements InvocationHandler{
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return null;
        }
    }
}
