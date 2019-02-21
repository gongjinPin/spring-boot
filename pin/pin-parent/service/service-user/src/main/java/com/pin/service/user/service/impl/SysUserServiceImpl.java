package com.pin.service.user.service.impl;

import com.pin.dao.user.sys.SysUserDao;
import com.pin.model.user.sys.SysUser;
import com.pin.service.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @create 2019-02-19 14:00
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserDao sysUserDao;


    @Override
    public SysUser selectByPrimaryKey(Integer id) {
        return sysUserDao.selectByPrimaryKey(id);
    }
}
