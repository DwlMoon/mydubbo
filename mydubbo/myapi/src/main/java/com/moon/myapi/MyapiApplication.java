package com.moon.myapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class MyapiApplication {

    public static void main (String[] args) {
        SpringApplication.run(MyapiApplication.class, args);
    }

}
