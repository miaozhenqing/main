package com.example.chx.test.guava.eventbus;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

public class EventListener {
    @Subscribe
    public void listen(TestEvent event){
        String sss=event.getMessage();
        System.out.println(sss);
    }
//    @Subscribe
    public void listenInt(Integer event){
        System.out.println(event);
    }
//    @Subscribe
    public void listenStr(String str){
        System.out.println(str);
    }
//    @Subscribe
    public void listenDead(DeadEvent event) {
        System.out.println("not interested");
    }
    @Subscribe
    public void listenNumber(Number event) {
        System.out.println("Number Number");
    }
}
