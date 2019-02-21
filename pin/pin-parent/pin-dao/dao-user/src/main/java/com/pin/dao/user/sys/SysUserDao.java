package com.pin.dao.user.sys;

import com.pin.model.user.sys.SysUser;

/**
 * @author
 * @create 2019-02-19 13:35
 **/
public interface SysUserDao {
    /**
     * 根据主键删除
     * 参数:主键
     * 返回:删除个数
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    int insert(SysUser record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    int insertSelective(SysUser record);

    /**
     * 根据主键查询
     * 参数:查询条件,主键值
     * 返回:对象
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    SysUser selectByPrimaryKey(Integer id);

    /**
     * 根据主键修改，空值条件不会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * 根据主键修改，空值条件会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    int updateByPrimaryKey(SysUser record);
}
