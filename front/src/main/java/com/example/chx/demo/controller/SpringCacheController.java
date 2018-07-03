package com.example.chx.demo.controller;

import com.example.chx.demo.service.SpringCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: <br>测试springCache功能，存在redis中
 * 系统版本: 2.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2018/3/13<br>
 * <br>
 */
@RestController
@RequestMapping("/frontDemo/springCache")
public class SpringCacheController {
    @Autowired
    private SpringCacheService springCacheServiceImpl;
    @RequestMapping("/cacheTest")
    public String sayHi( String name){
        return springCacheServiceImpl.sayHi(name);
    }
}
