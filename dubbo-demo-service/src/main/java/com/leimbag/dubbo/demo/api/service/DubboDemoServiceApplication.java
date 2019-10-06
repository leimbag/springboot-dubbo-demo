package com.leimbag.dubbo.demo.api.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.leimbag.dubbo.demo.api.service")
public class DubboDemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoServiceApplication.class, args);
    }

}
