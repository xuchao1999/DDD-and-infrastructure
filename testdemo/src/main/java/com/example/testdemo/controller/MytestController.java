package com.example.testdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my")
public class MytestController {

    @GetMapping("/test/{value}")
    public String test(@PathVariable String value){
        return "test:  " + value;
    }
}
