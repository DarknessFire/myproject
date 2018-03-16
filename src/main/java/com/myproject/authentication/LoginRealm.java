package com.myproject.authentication;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @author lijinzao
 * @date 2018/3/15 11:16
 **/
public class LoginRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("-------------------------------");
        System.out.println("doGetAuthorizationInfo");
        System.out.println("-------------------------------");

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("-------------------------------");
        System.out.println("doGetAuthenticationInfo2");
        System.out.println("-------------------------------");

        return null;
    }
}
