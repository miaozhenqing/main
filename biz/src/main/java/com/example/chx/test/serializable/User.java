package com.example.chx.test.serializable;

import java.io.Serializable;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :
 * @version: 2.0
 */
public class User implements Serializable{
     private String name;
     private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void sayHi(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>hi");
    }
}
