package com.example.sentitest.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelApiDemo {
    @GetMapping("/ss")
    @SentinelResource("tdsdf")
    public String c() {
        return "dddd";
    }
}
