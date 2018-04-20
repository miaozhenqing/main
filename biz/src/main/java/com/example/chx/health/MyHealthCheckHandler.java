package com.example.chx.health;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * @author: mzq
 * @date: 2018/4/19
 * @description : 健康检查处理器
 * 将服务提供者的健康状态传递给eureka服务器
 * @version: 2.0
 */
@Component
public class MyHealthCheckHandler implements HealthCheckHandler {

    @Autowired
    private MyHealthIndicator myHealthIndicator;

    @Override
    public InstanceInfo.InstanceStatus getStatus(InstanceInfo.InstanceStatus instanceStatus) {
        Status status = myHealthIndicator.health().getStatus();
        if (status.equals(Status.UP)){
            return InstanceInfo.InstanceStatus.UP;
        } else {
            return InstanceInfo.InstanceStatus.DOWN;
        }
    }
}
