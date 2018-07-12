package com.example.chx.test.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: mzq
 * @date: 2018/7/4
 * @description :java堆溢出
 * @version: 2.0
 */
public class DuiOutOfMemory {
    public static void main(String[] args) {
        List<UserEntity> list = new ArrayList<>();
        while (true){
            list.add(new UserEntity());
        }
    }
}
