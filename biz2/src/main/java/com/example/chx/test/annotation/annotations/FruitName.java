package com.example.chx.test.annotation.annotations;

/**
 * @author: mzq
 * @date: 2018/3/21
 * @description :水果名称
 * @version: 2.0
 */

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/*
 * @description 水果名称
 * @author mzq
 * @date 2018/3/21
 * @param
 * @return
 */
@Target(FIELD)
@Retention(RUNTIME )
@Documented
public @interface FruitName {
    String name() default "xx水果";
}
