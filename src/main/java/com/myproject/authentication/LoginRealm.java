package com.myproject.authentication;

import com.myproject.manager.UserManager;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lijinzao
 * @date 2018/3/15 11:16
 **/
public class LoginRealm extends AuthorizingRealm {
    @Autowired
    private UserManager userService;

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
        String username = (String) authenticationToken.getPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Set hs = new HashSet();
        hs.add(userService.findUser().getRoleType());
        authorizationInfo.setRoles(hs);
        Set hs2 = new HashSet();
        hs2.add("admin");
        authorizationInfo.setStringPermissions(hs2);
        return null;
    }
}
