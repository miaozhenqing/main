package com.example.chx.test.calltest;

import com.example.chx.ILoginService;
import org.springframework.stereotype.Service;

/**
 * @ClassName ILoginServiceImpl
 * @Description TODO
 * @Author Mzq
 * @Date 2019/1/15 14:13
 * @Version 1.0
 **/
@Service
public class ILoginServiceImpl implements ILoginService {
    @Override
    public String login(String name) {
        System.out.println(name+"is logining");
        return "login successfully , "+name;
    }
}
