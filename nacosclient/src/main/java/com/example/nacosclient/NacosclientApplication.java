package com.example.nacosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * The type Nacosclient application.
 *
 * @author xuchao
 * @date 2022 -07-20 08:57:35
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosclientApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(NacosclientApplication.class, args);
    }

}
