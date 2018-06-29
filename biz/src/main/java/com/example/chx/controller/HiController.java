package com.example.chx.controller;

import com.example.chx.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private HiService hiServiceImpl;
    @RequestMapping("/hi")
    public String sayHi( String name){
        return hiServiceImpl.sayHi(name);
    }
}
