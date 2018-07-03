package com.example.chx.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mzq on 2018/3/14.
 */
@FeignClient(name = "biz")
@Service
public interface HiService {
    @RequestMapping(value = "/bizDemo/springCache/cacheTest",method = RequestMethod.POST)
    String sayHi(String name);
}
