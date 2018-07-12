package com.example.chx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: mzq
 * @date: 2018/4/20
 * @description :
 * @version: 2.0
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping("/getbiz")
    public String getbiz(String name){
        this.loadBalancerClient.choose("biz");
        String str = restTemplate.getForObject("http://biz/session/getshare?name="+name,String.class);
        return str;
    }

}
