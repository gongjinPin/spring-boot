package com.pin.controller.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //使用feign需要添加此注释
public class ControllerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControllerUserApplication.class, args);
    }

}

