package com.myproject.authentication;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author lijinzao
 * @date 2018/3/16 18:00
 **/
public class StatelessToken implements AuthenticationToken {

    public Object getPrincipal() {
        return null;
    }

    public Object getCredentials() {
        return null;
    }
}
