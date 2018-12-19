package com.example.chx.test.guava.eventbus;

import com.example.chx.test.atest.Test;
import com.google.common.eventbus.EventBus;

import java.util.ArrayList;

public class MainClient {
    public static void main(String[] args) {
        EventBus bus=new EventBus();
        EventListener listener = new EventListener();
        bus.register(listener);
        TestEvent event=new TestEvent();
        event.setMessage("hello world");
        bus.post(event);
//        bus.post(new Integer(10));
//        bus.post(new String("hello - world"));
//        bus.post(new Integer(10));
    }
}
