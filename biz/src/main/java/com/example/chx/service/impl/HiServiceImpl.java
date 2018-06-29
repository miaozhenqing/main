package com.example.chx.service.impl;

import com.example.chx.service.HiService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: mzq
 * @date: 2018/6/29
 * @description :
 * @version: 2.0
 */
@Service
public class HiServiceImpl implements HiService {
    @Override
    @Cacheable(value = "sayHiCache")
    public String sayHi(String name) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>biz 执行 sayHi 方法>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "Hi-"+name;
    }
}
