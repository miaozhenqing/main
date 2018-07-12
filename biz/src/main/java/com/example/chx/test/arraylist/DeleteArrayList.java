package com.example.chx.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :循环删除ArrayList
 * @version: 2.0
 */
public class DeleteArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        delete2(list);
        System.out.println(list);
    }

    //倒序删除
    public static void delete(ArrayList list){
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).equals("b")){
                list.remove(i);
            }
        }
    }
    //通过Iterator remove
    public static void delete2(ArrayList<String> list){
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            String string = (String) iterator.next();
            if(string.equals("b")){
                iterator.remove();
            }
        }
    }
}
