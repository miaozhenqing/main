package com.example.chx.demo.annotation;

import com.example.chx.demo.annotation.annotations.FruitColor;
import com.example.chx.demo.annotation.annotations.FruitName;

/**
 * @author: mzq
 * @date: 2018/3/21
 * @description :
 * @version: 2.0
 */
public class Apple {
    @FruitName
    private String name;
    @FruitColor
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
