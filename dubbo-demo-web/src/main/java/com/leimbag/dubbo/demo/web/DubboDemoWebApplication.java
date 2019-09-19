package com.leimbag.dubbo.demo.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages="com.leimbag.dubbo.demo.api")
public class DubboDemoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoWebApplication.class, args);
    }

}
