package com.pin.service.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @create 2019-02-15 13:35
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);


    @PostMapping(value = "/demo")
    public String demo(){
        logger.info("subject:{}",this.getClass().toString()+"测试请求");
        return "demo";
    }

}
