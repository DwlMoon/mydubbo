package com.moon.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//开启基于注解的dubbo功能
@EnableDubbo
public class ConsumerApplication {

    public static void main (String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
