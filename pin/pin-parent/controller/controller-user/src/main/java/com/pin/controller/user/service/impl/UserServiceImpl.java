package com.pin.controller.user.service.impl;

import com.pin.controller.user.feignService.UserFeignService;
import com.pin.controller.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @create 2019-02-15 14:04
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserFeignService userFeignService;

    @Override
    public String demo() {
        return userFeignService.demo();
    }

    @Override
    public String getSysUser(Integer id) {
        return userFeignService.getSysUser(id);
    }
}
