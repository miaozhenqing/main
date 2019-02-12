package com.example.chx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    private HiService hiService;

    @RequestMapping("/sayhi")
    public String sayHi(@RequestBody String name){
        String str = hiService.sayHi(name);
        return str;
    }

    @RequestMapping("/hi")
    public String hi( String name){
        String str = "front: hi ,"+name;
        return str;
    }
}
