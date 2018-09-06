package com.example.chx.test.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: mzq
 * @date: 2018/8/29
 * @description :
 * @version: 2.0
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket = null;
        InputStream in=null;
        OutputStream os=null;
        try {
            serverSocket=new ServerSocket(8888);
            socket = serverSocket.accept();
            in = socket.getInputStream();
            os = socket.getOutputStream();
            byte[] bytes=new byte[1024];
            for(int i = 0;i < 3;i++){
                in.read(bytes);
                System.out.println("接收到："+new String(bytes,"utf-8"));
                os.write("get hello world".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null!=socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null!=serverSocket){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
