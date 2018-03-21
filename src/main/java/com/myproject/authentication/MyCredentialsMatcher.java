package com.myproject.authentication;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.mgt.SubjectDAO;

/**
 * @author lijinzao
 * @date 2018/3/21 14:51
 **/
public class MyCredentialsMatcher implements CredentialsMatcher {
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        System.out.println(token);
        System.out.println(info);
        SubjectDAO subjectDAO;
        return true;
    }
}
