package com.example.sentineldemo.controller;

import com.example.sentineldemo.service.SentinelFeignService;
import com.example.sentineldemo.service.VerifycodeProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {
    @Resource
    private HttpServletRequest req;

    @Resource
    private HttpServletResponse resp;

    @Resource
    private SentinelFeignService sentinelFeignService;

    @Resource
    private VerifycodeProviderService verifycodeProviderService;

    @GetMapping("/test/{msg}")
    public String demo(@PathVariable String msg) {
        return sentinelFeignService.test(msg) + "    getaway";
    }

    @GetMapping("/get")
    public void getVerifycode() {
        verifycodeProviderService.getVerifyCode(req, resp);
    }
}
