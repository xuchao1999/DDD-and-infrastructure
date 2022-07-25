package com.example.sentineldemo.service;

import com.example.sentineldemo.service.imp.FallbackSentinelFeignServiceimp;
import com.example.sentineldemo.service.imp.FallbackVerifycodeProviderServiceImp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@FeignClient(value = "getaway-server", fallback = FallbackVerifycodeProviderServiceImp.class)
@RequestMapping("/verifycode")
public interface VerifycodeProviderService {
    @GetMapping("/getCode")
    public void getVerifyCode(@RequestParam HttpServletRequest req, @RequestParam HttpServletResponse resp);
}
