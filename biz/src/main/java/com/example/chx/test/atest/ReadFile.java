package com.example.chx.test.atest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author: mzq
 * @date: 2018/8/15
 * @description :读取文件并输出
 * @version: 2.0
 */
public class ReadFile {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\mzq\\Desktop\\task1111.txt");
        try {
            byte[] bytes=new byte[1024];
            InputStream inputStream=new FileInputStream(file);
            inputStream.read(bytes);
            System.out.println(new String(bytes,"gbk"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
