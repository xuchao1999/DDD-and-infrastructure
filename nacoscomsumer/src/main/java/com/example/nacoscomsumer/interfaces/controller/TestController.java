package com.example.nacoscomsumer.interfaces.controller;

import com.example.nacosclient.infrastract.common.annotation.WebLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * The type Test controller.
 *
 * @author xuchao
 * @date 2022 -07-19 10:24:02
 */
@RestController
@Slf4j
public class TestController {
    /**
     * Test string.
     *
     * @param str the str
     * @return the string
     */
    @GetMapping(value = "/nacos/{str}")
    @WebLog
    public String test(@PathVariable String str) {
        return "port: 8801 " + str;
    }
}
