package com.example.chx.test.fanshe;

import com.example.chx.test.serializable.User;

/**
 * @author: mzq
 * @date: 2018/7/13
 * @description :java 反射
 * @version: 2.0
 */
public class FanShe {
    public static void main(String[] args) throws Exception{
        Class<User> clazz = User.class;
        Object object = clazz.newInstance();
    }
}
