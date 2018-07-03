package com.example.chx.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: mzq
 * @date: 2018/7/2
 * @description :分布式session测试
 * @version: 2.0
 */
@RestController
@RequestMapping("/bizDemo/session")
public class SessionController {
    @RequestMapping("/sessionTest")
    public String sessionTest(HttpServletRequest request){
        String name=request.getParameter("name");
        if("tom".equals(name)){
            return "success";
        }
        return "fail";
    }
}
