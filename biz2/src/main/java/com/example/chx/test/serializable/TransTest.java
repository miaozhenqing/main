package com.example.chx.test.serializable;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :传值，传引用
 * @version: 2.0
 */
public class TransTest {
    public static void main(String[] args) {
        User user=new User();
        user.setAge("22");
        setString(user);
        System.out.println(user.getAge());
    }
    public static void setString(User user){
        user.setAge("111");
    }
}
