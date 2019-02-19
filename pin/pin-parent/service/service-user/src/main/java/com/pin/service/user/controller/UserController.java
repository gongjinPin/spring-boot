package com.pin.service.user.controller;

import com.pin.common.util.JsonUtil;
import com.pin.model.user.sys.SysUser;
import com.pin.service.user.service.SysUserService;
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
    SysUserService sysUserService;


    @PostMapping(value = "/demo")
    public String demo(){
        logger.info("subject:{}",this.getClass().toString()+"测试请求");
        return "demo";
    }

    @PostMapping(value = "/getSysUser")
    public String getSysUser(@RequestParam("id") Integer id){
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        logger.info("subject:{},sysUser","id对象数据",JsonUtil.gsonStr(sysUser));
        return JsonUtil.gsonStr(sysUser);
    }

}
