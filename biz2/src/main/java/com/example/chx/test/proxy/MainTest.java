package com.example.chx.test.proxy;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description : 动态代理实现
 * @version: 2.0
 */
public class MainTest {
    public static void main(String[] args) {
        //[1]jdk动态代理实现
        UserServiceProxyHandler handler=new UserServiceProxyHandler(new UserServiceImpl());
        //创建代理类实例
        UserService userServiceImpl= (UserService)Proxy.newProxyInstance(UserService.class.getClassLoader(),new Class[]{UserService.class},handler);
//        userServiceImpl.addUser();

        //[2]cglib动态代理
        CglibHandler cglibHandler=new CglibHandler();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibHandler);
        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.addUser();
    }
}
