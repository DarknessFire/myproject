package com.myproject.model.entity;

import com.myproject.common.model.entity.BaseEntity;

/**
 * @author lijinzao
 * @date 2018/3/16 16:44
 **/
public class User extends BaseEntity<User> {
    private String userId;
    private String userName;
    private String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
