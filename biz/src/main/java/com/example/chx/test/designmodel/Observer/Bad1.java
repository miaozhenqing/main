package com.example.chx.test.designmodel.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: mzq
 * @date: 2018/7/26
 * @description :
 * @version: 2.0
 */
public class Bad1 implements BadGuys {
    List<Police> list=new ArrayList();
    @Override
    public void add(Police police) {
        if(!list.contains(police)){
            list.add(police);
        }
    }

    @Override
    public void remove(Police police) {
        if(list.contains(police)){
            list.remove(police);
        }
    }

    @Override
    public void notice(String msg) {
        for(Police police:list){
            police.update(msg);
        }
    }
}
