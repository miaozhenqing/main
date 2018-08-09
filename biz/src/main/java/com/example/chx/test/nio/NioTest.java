package com.example.chx.test.nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

/**
 * @author: mzq
 * @date: 2018/7/23
 * @description :
 * @version: 2.0
 */
public class NioTest {
    public static void main(String[] args) throws Exception{
        Selector selector=Selector.open();
        RandomAccessFile aFile = new RandomAccessFile("D:\\test.txt", "rw");
        FileChannel channel=aFile.getChannel();

    }
}
