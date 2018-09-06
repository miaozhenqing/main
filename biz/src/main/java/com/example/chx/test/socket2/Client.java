package com.example.chx.test.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: mzq
 * @date: 2018/8/29
 * @description :
 * @version: 2.0
 */
public class Client {
    public static void main(String[] args) {
        String data[] ={"First","Second","Third"};
        Socket socket=null;
        OutputStream os=null;
        InputStream in=null;
        try {
            socket = new Socket("127.0.0.1",8888);
            os = socket.getOutputStream();
            in=socket.getInputStream();
            byte[] bytes=new byte[1024];
            for(int i = 0;i < data.length;i++){
                os.write(data[i].getBytes());
                in.read(bytes);
                System.out.println("返回"+new String(bytes,"utf-8"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null!=os){
                try {
                    os.close();
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
        }
    }
}
