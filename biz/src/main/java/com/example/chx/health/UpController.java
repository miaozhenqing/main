package com.example.chx.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mzq
 * @date: 2018/3/22
 * @description :改变up这个变量的值来模拟健康状态UP->DOWN
 * @version: 2.0
 */
@RestController
@RequestMapping("/biz")
public class UpController {
    @Autowired
    MyHealthChecker myHealthChecker;

    @RequestMapping("/up")
    public String up(@RequestParam("up") Boolean up) {
        myHealthChecker.setUp(up);
        return up.toString();
    }

}
