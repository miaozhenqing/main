package com.example.chx.controller;

import com.example.chx.demo.annotation.Apple;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2018/3/13<br>
 * <br>
 */
@RestController
public class HiController {
    @RequestMapping("/hi")
    public String sayHi( String name){
        System.out.println("*********执行 biz 方法 sayHi**********");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        String str = "8092  -   biz: hi ,"+name;
        return str;
    }
    @RequestMapping("/apple")
    public void Apple(){
        Apple apple=new Apple();
        System.out.println(apple.getName()+" is "+apple.getColor());
    }
}
