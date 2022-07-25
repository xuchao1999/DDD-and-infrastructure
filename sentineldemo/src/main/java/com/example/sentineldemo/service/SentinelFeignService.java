package com.example.sentineldemo.service;

import com.example.sentineldemo.service.imp.FallbackSentinelFeignServiceimp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "getaway-server", fallback = FallbackSentinelFeignServiceimp.class)
public interface SentinelFeignService {
    @GetMapping(value = "/nacos/{str}")
    public String test(@PathVariable String str);
}
