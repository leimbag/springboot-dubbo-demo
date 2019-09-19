package com.leimbag.dubbo.demo.xml.web.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author leimbag
 */
@Configuration
@EnableDubbo(scanBasePackages="com.leimbag.dubbo.demo.api")
@ImportResource(value = {"classpath:bean-dubbo-service.xml"})
public class DubboConfig {
}
