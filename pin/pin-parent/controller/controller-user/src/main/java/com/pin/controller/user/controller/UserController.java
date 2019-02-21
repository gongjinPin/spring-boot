package com.pin.controller.user.controller;

import com.pin.controller.user.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @create 2019-02-15 13:35
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    UserService userService;

    /**
     * 没有引入db
     * @return
     */
    @PostMapping(value = "/demo")
    public String demo(){
        logger.info("subject:{}",this.getClass().toString()+"测试请求");
        return userService.demo();
    }

    /**
     * 引入db
     * @param id
     * @return
     */
    @PostMapping(value = "/getSysUser")
    public String getSysUser(@RequestParam("id") Integer id){
        logger.info("subject:{},sysUser","id对象数据",id);
        return userService.getSysUser(id);
    }

}
