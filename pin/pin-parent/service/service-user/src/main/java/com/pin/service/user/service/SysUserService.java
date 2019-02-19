package com.pin.service.user.service;

import com.pin.model.user.sys.SysUser;

/**
 * @author
 * @create 2019-02-19 13:59
 **/
public interface SysUserService {

    /**
     * 根据主键查询
     * 参数:查询条件,主键值
     * 返回:对象
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    SysUser selectByPrimaryKey(Integer id);

}
