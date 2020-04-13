package com.wgcisotto.justgifit.io.health;

import com.wgcisotto.justgifit.properties.JustGifItProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class JustGifItHealthIndicator implements HealthIndicator {

    @Autowired
    private JustGifItProperties properties;

    @Override
    public Health health() {
        if(!properties.getGifLocation().canRead()){
            return Health.down().withDetail("canRead", "false").build();
        }
        return Health.up().build();
    }
}
