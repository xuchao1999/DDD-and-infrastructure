package com.example.sentineldemo.service.imp;

import com.example.sentineldemo.service.VerifycodeProviderService;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class FallbackVerifycodeProviderServiceImp implements VerifycodeProviderService {
    @Override
    public void getVerifyCode(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("error");
        ;
    }
}
