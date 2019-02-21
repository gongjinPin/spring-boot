package com.pin.controller.user.controller;

import com.pin.controller.user.log.UserRepositoryLog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试MongoDB配置是否成功
 * @author
 * @create 2019-02-21 9:14
 **/
@RestController
@RequestMapping(value = "/userRepositoryLog")
public class UserRepositoryLogController {

    private static final Logger logger = LogManager.getLogger(UserRepositoryLogController.class);

    @Autowired
    UserRepositoryLog userRepositoryLog;


    @PostMapping(value = "/saveUserRepositoryLog")
    public String saveUserRepositoryLog(){
        logger.info("subject:{}","测试MongoDB数据新增");
        return userRepositoryLog.saveUserRepositoryLog();
    }
}
