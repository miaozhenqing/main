package com.example.chx.test.innerclass;

/**
 * @author: mzq
 * @date: 2018/8/17
 * @description :内部类
 * @version: 2.0
 */
public class OutClass {
    public static void say(){
        System.out.println("ddddddd");
    }
    //=============成员内部类====================
    //public private protected 都可以修饰
    public class InClass{
        private String ccc="cccccc";
        public  void  ss(){}
    }

    //=============局部内部类====================
    //局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内。
    public void methodddd(){
        class InClass{
        }
    }

    //================静态内部类=================
    //public private protected 都可以修饰
    public static class staticInnerClass{
        private static String a;
        public int aa;
        public static void mee(){
            String a;
            System.out.println("dddddddd");
        }
    }

}
