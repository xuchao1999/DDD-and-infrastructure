package com.example.sentineldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SentineldemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentineldemoApplication.class, args);
    }

}
