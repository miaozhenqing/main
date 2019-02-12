package com.example.chx.calltest;

import com.example.chx.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CallTestController
 * @Description TODO
 * @Author Mzq
 * @Date 2019/1/15 14:12
 * @Version 1.0
 **/
@RestController
public class CallTestController {
    @RequestMapping("/dologin")
    public void doLogin(){
        DummyInvocationHandler handler=new DummyInvocationHandler();
        String name = "toooooooooooooo";
    }
}
