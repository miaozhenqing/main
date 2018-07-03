package com.example.chx.demo.service.impl;

import com.example.chx.demo.service.SpringCacheService;
import org.springframework.stereotype.Service;

/**
 * @author: mzq
 * @date: 2018/6/29
 * @description :
 * @version: 2.0
 */
@Service
public class SpringCacheServiceImpl implements SpringCacheService {
    @Override
//    @Cacheable(value = "sayHiCache")
    public String sayHi(String name) {
        String a="3333333333333";
        return a;
    }
}
