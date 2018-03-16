package com.myproject.authentication;

import org.apache.shiro.authc.AuthenticationToken;

import java.util.Map;

/**
 * @author lijinzao
 * @date 2018/3/16 18:00
 **/
public class StatelessToken implements AuthenticationToken {
    private String username;
    private Map<String, ?> params;
    private String clientDigest;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, ?> getParams() {
        return params;
    }

    public void setParams(Map<String, ?> params) {
        this.params = params;
    }

    public String getClientDigest() {
        return clientDigest;
    }

    public void setClientDigest(String clientDigest) {
        this.clientDigest = clientDigest;
    }

    public Object getPrincipal() {
        return username;
    }

    public Object getCredentials() {
        return clientDigest;
    }
}
