package com.example.sentineldemo.service.imp;

import com.example.sentineldemo.service.SentinelFeignService;
import org.springframework.stereotype.Component;

@Component
public class FallbackSentinelFeignServiceimp implements SentinelFeignService {
    @Override
    public String test(String str) {
        return "sentinel";
    }
}
