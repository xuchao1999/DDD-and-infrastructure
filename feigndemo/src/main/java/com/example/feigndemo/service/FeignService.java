package com.example.feigndemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("nacos-provider")
public interface FeignService {
    @GetMapping(value = "/nacos/{str}")
    public String test(@PathVariable String str);
}
