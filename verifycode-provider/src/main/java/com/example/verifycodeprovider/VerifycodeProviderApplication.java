package com.example.verifycodeprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@ComponentScan("com.example.verifycodeprovider.config")
public class VerifycodeProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerifycodeProviderApplication.class, args);
    }

}
