package com.example.chx.test.socket;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: mzq
 * @date: 2018/7/12
 * @description : socket编程客户端
 * @version: 2.0
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket socket=new Socket("127.0.0.1",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello world".getBytes("utf-8"));
        outputStream.flush();
        outputStream.close();
        socket.close();
    }
}
