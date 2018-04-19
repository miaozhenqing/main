package com.example.chx.annotation.handle;

import com.example.chx.annotation.annotations.FruitColor;
import com.example.chx.annotation.annotations.FruitName;

import java.lang.reflect.Field;

/**
 * @author: mzq
 * @date: 2018/3/21
 * @description : 处理自定义注解
 * @version: 2.0
 */
public class HandleAnnotation {
    public static void getFruitInfo(Class<?> clazz){
        Field[] fieldArr = clazz.getDeclaredFields();
        for (Field field:fieldArr){
            if(field.isAnnotationPresent(FruitName.class)){
                try {
                    field=FruitName.class.getField("name");
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }else if(field.isAnnotationPresent(FruitColor.class)){
                try {
                    field=FruitColor.class.getField("color");
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
