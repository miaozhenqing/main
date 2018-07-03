package com.example.chx.test.proxy;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :
 * @version: 2.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>新增用户");
    }

    @Override
    public void delUser() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>删除用户");
    }
}
