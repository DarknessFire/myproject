package com.myproject.model.vo;

/**
 * @author lijinzao
 * @date 2018/3/19 17:42
 **/
public class UserVO {
    private String id;
    private String userName;
    private String password;
    private String roleType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}
