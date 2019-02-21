package com.pin.controller.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class,MongoDataAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients  //使用feign需要添加此注释
//@EnableMongoAuditing //自动配置MongoDB采用此注解，手动配置就要注释
@ComponentScan(basePackages = {"com.pin.controller.user.*","com.pin.mongodb.*"})
@EnableMongoRepositories(basePackages={"com.pin.mongodb.dao"})
public class ControllerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControllerUserApplication.class, args);
    }

}

