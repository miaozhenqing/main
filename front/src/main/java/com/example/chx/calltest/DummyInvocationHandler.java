package com.example.chx.calltest;

import com.example.chx.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName BizBalance
 * @Description TODO
 * @Author Mzq
 * @Date 2019/1/15 14:23
 * @Version 1.0
 **/
public class DummyInvocationHandler implements InvocationHandler {
    private Object targetObject;

    public DummyInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>开始");
        method.invoke(targetObject, args);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>结束");
        return null;
    }
}
