package com.example.chx.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: mzq
 * @date: 2018/6/29
 * @description :
 * @version: 2.0
 */
@FeignClient(name = "biz")
@Service
public interface SpringCacheService {
    @RequestMapping(value = "/bizDemo/springCache/cacheTest",method = RequestMethod.POST)
    String sayHi(String name);
}
