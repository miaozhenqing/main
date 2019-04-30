package com.example.chx.test.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Mzq
 * @Date 2019/3/4 16:41
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) throws Exception{
        //获取socket通道
        SocketChannel  schannel = SocketChannel.open();
        schannel.configureBlocking(false);
        //获得通道管理器
        Selector selector=Selector.open();
        schannel.connect(new InetSocketAddress("127.0.0.1", 8888));
        //为该通道注册SelectionKey.OP_CONNECT事件
        schannel.register(selector, SelectionKey.OP_CONNECT);
        while(true){
            //选择注册过的io操作的事件(第一次为SelectionKey.OP_CONNECT)
            selector.select();
            for(SelectionKey key:selector.keys()){
                if(key.isConnectable()){
                    SocketChannel channel=(SocketChannel)key.channel();
                    if(channel.isConnectionPending()){
                        channel.finishConnect();//如果正在连接，则完成连接
                    }
                    channel.register(selector, SelectionKey.OP_READ);
                }else if(key.isReadable()){ //有可读数据事件。
                    SocketChannel channel = (SocketChannel)key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(10);
                    channel.read(buffer);
                    byte[] data = buffer.array();
                    String message = new String(data);
                    System.out.println("recevie message from server:, size:"
                            + buffer.position() + " msg: " + message);
                }
            }
        }
    }
}
