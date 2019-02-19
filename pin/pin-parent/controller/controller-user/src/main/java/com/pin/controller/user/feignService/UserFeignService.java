package com.pin.controller.user.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author
 * @create 2019-02-15 14:02
 **/
@FeignClient(value = "service-user")
public interface UserFeignService {

    @PostMapping(value = "/user/demo")
    String demo();

    @PostMapping(value = "/user/getSysUser")
    String getSysUser(@RequestParam("id") Integer id);
}
