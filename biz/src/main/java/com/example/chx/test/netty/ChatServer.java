package com.example.chx.test.netty;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class ChatServer {

    private final int port;

    public ChatServer(int port) {
        this.port = port;
    }

    public void start() throws Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<Channel>() {
                        @Override
                        protected void initChannel(Channel channel) throws Exception {
                            System.out.println("客户端连接：" + channel.remoteAddress());
                            //用户定义的ChannelInitailizer加入到这个channel的pipeline上面去，这个handler就可以用于处理当前这个channel上面的一些事件
                            ChannelPipeline pipeline = channel.pipeline();
                            //ChannelPipeline类似于一个管道，管道中存放的是一系列对读取数据进行业务操作的ChannelHandler。
                            /**
                             * 发送的数据在管道里是无缝流动的，在数据量很大时，为了分割数据，采用以下几种方法
                             * 定长方法
                             * 固定分隔符
                             * 将消息分成消息体和消息头，在消息头中用一个数组说明消息体的长度
                             */
                            pipeline.addLast("frame",new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
                            pipeline.addLast("decode",new StringDecoder());
                            pipeline.addLast("encode",new StringEncoder());
                            pipeline.addLast("handler",new ChatServerHandler());
                        }
                    }).option(ChannelOption .SO_BACKLOG, 1024)
                    .option(ChannelOption.SO_KEEPALIVE,true);
            ChannelFuture future = b.bind(port).sync();
            System.out.println(ChatServer.class.getName() + "启动成功，监听 " + future.channel().localAddress());
            //使用sync方法进行阻塞，等待服务端链路关闭之后Main函数才退出
            future.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //优雅退出，释放线程池资源
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) throws Exception {
        ChatServer server = new ChatServer(8099);
        server.start();

    }

}

