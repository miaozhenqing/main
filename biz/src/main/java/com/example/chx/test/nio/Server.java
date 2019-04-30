package com.example.chx.test.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @ClassName Server
 * nio示例服务端
 * @Author Mzq
 * @Date 2019/3/4 16:15
 * @Version 1.0
 **/
public class Server {
    public static void main(String[] args) throws Exception{
        //获取一个ServerSocket通道
        ServerSocketChannel serverSocketChannel=ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(8888));
        //获取通道管理器
        Selector selector = Selector.open();
        //将通道管理器与通道绑定，并为该通道注册SelectionKey.OP_ACCEPT事件
        serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);

        while(true){
            selector.select();
            for(SelectionKey key:selector.keys()){
                if(key.isAcceptable()){
                    ServerSocketChannel socketChannel=(ServerSocketChannel)key.channel();
                    SocketChannel channel = socketChannel.accept();
                    channel.write(ByteBuffer.wrap(new String("send message to client").getBytes()));
                    //在与客户端连接成功后，为客户端通道注册SelectionKey.OP_READ事件。
                    channel.register(selector, SelectionKey.OP_READ);
                }
            }
        }
    }
}
