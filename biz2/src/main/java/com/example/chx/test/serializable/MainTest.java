package com.example.chx.test.serializable;


import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :
 * @version: 2.0
 */
public class MainTest {
    public static void main(String[] args) throws Exception{
        User u = new User();
        List<User> friends = new ArrayList<>();
        u.setName("张三");
        u.setAge("123456");

        User f1 = new User();
        f1.setName("李四");
        f1.setAge("123456");

        User f2 = new User();
        f2.setName("王五");
        f2.setAge("123456");

        friends.add(f1);
        friends.add(f2);

        Long t1 = System.currentTimeMillis();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream obj = new ObjectOutputStream(out);
        for(int i = 0; i<10; i++) {
            obj.writeObject(u);
        }
        System.out.println("java serialize: " +(System.currentTimeMillis() - t1) + "ms; 总大小：" + out.toByteArray().length );

        Long t2 = System.currentTimeMillis();
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new java.io.ByteArrayInputStream(out.toByteArray())));
        User user = (User) ois.readObject();
        System.out.println("java deserialize: " + (System.currentTimeMillis() - t2) + "ms; User: " + user);
    }
}
