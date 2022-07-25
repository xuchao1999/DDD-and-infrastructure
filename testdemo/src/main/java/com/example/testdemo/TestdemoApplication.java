package com.example.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestdemoApplication.class, args);
    }

}
