package com.example.chx.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author: mzq
 * @date: 2018/3/22
 * @description :
 * @version: 2.0
 */
@Component
public class MyHealthChecker implements HealthIndicator {
    private boolean up = true;

    @Override
    public Health health() {
        if (up) {
            return new Health.Builder().withDetail("aaa_cnt", 10).withDetail("bbb_status", "up").up().build();
        } else {
            return new Health.Builder().withDetail("error", "client is down").down().build();
        }
    }
    public boolean isUp() {
        return up;
    }
    public void setUp(boolean up) {
        this.up = up;
    }
}
