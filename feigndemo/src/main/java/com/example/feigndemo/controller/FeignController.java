package com.example.feigndemo.controller;

import com.example.feigndemo.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {
    @Resource
    private FeignService feignService;

    @GetMapping("/{str}")
    public String feigndemo(@PathVariable String str) {
        String result = feignService.test(str);
        return "feigndemo  " + result;
    }
}
