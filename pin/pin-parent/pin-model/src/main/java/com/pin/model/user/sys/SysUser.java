package com.pin.model.user.sys;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    /**
     * sys_user.id (用户Id)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private Integer id;

    /**
     * sys_user.username (用户名)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String username;

    /**
     * sys_user.password (密码)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String password;

    /**
     * sys_user.phone (手机)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String phone;

    /**
     * sys_user.sex (性别)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String sex;

    /**
     * sys_user.email (邮箱)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String email;

    /**
     * sys_user.mark (备注)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String mark;

    /**
     * sys_user.rank (账号等级)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String rank;

    /**
     * sys_user.lastLogin (最后一次登录时间)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private Date lastlogin;

    /**
     * sys_user.loginIp (登录ip)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String loginip;

    /**
     * sys_user.imageUrl (头像图片路径)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String imageurl;

    /**
     * sys_user.regTime (注册时间)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private Date regtime;

    /**
     * sys_user.locked (账号是否被锁定)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private Boolean locked;

    /**
     * sys_user.rights (权限（没有使用）)
     * @ibatorgenerated 2019-02-19 13:43:56
     */
    private String rights;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }
}