package com.pin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PinConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinConfigApplication.class, args);
    }

}

