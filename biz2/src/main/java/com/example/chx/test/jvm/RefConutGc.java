package com.example.chx.test.jvm;

/**
 * @author: mzq
 * @date: 2018/7/4
 * @description :引用计数法gc
 * @version: 2.0
 */
public class RefConutGc {
    private Object object=null;

    public static void test(){
        RefConutGc gc1=new RefConutGc();
        RefConutGc gc2=new RefConutGc();
        gc1.object=gc2;
        gc2.object=gc1;
        gc1=null;
        gc2=null;
        System.gc();
    }

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);
    }
}
