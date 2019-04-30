package com.example.chx.test.vertx.vertx_web;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName SimpleRouter
 * vert.x web开发
 * 参考：https://blog.csdn.net/king_kgh/article/details/80848571
 * @Author Mzq
 * @Date 2019/2/12 15:52
 * @Version 1.0
 **/
public class SimpleRouter extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        // 创建HttpServer
        HttpServer server = vertx.createHttpServer();
        // 创建路由对象
        Router router= Router.router(vertx);
        // 监听/index地址 post和get
        router.route("/index").handler(routingContext ->{
            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "text/plain");

            // 写入响应并结束处理
            response.end("Hello World !");});


        //使用POST请求
//        router.post("/index").handler(routingContext -> {
//            HttpServerResponse response = routingContext.response();
//            response.end("post 调用");
//        });
        //使用get请求
//        router.route(HttpMethod.GET, "/index").handler(request -> {
//            request.response().end("get 调用");
//        });

        server.requestHandler(router::accept);
        server.listen(8080, (result) -> {
            if (result.succeeded()) {
                System.out.println("ApiGatewayHttpServer.listen port:8080 successful.......");
            } else {
                System.out.println(result.cause().getMessage() + " -- " + result.cause());
            }
        });
    }

    public static void main(String[] args) {
        Vertx.vertx().deployVerticle(new SimpleRouter());
    }


    //泛型
    public <T> T sayHello(){
        System.out.println("hello");
        return null;
    }
}
