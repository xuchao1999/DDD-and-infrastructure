package com.example.verifycodeprovider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.verifycodeprovider.entity.VerifyCodeAttributes;
import com.example.verifycodeprovider.service.VerifyCodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/verifycode-provider1")
@Api(tags = "验证码Api")
public class VerifyCodeController {

    @Resource
    private VerifyCodeService verifyCodeService;

    @PostMapping("/getImageCode")
    @ApiOperation("获取图形验证码")
    public void getVerifyCode(@RequestBody VerifyCodeAttributes attributes) throws IOException {
        verifyCodeService.getImageVerifCode(attributes);
    }

    @GetMapping("/test")
    public String test() {
        return "dddd";
    }
}
