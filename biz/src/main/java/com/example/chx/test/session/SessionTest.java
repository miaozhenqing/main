package com.example.chx.test.session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mzq
 * @date: 2018/7/9
 * @description :redis实现session共享
 * @version: 2.0
 */
@RestController
@RequestMapping("/session")
public class SessionTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/share")
    public String test2(String name){
        if("mzq".equals(name)){
            redisTemplate.opsForValue().set("password","1000");
            return "success";
        }
        return "error";
    }
    @RequestMapping("/getshare")
    public String test(String name){
        String pas = redisTemplate.opsForValue().get("password").toString();

        return pas;
    }
}
