package com.pin.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

//只是用户单元测试，该服务只是被用jar被其它服务应用，不用运行
@SpringBootApplication
@EnableMongoAuditing
public class PinMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinMongodbApplication.class, args);
    }

}
