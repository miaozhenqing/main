package com.example.chx.test.socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: mzq
 * @date: 2018/7/12
 * @description :socket编程服务端
 * @version: 2.0
 */
public class Server {
    public static void main(String[] args)throws Exception {
        ServerSocket serverSocket=new ServerSocket(8888);
        System.out.println(">>>>>>>>>>>>>>>>>>>>服务器等待连接");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] mybyte=new byte[1024];
        int len;
        StringBuffer buffer=new StringBuffer();
        while ((len=inputStream.read(mybyte))!=-1){
            buffer.append(new String(mybyte,0,len,"utf-8"));
        }
        System.out.println("接收到消息: "+buffer);
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
