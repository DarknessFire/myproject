package com.myproject.authentication;

import com.myproject.model.vo.UserVO;
import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lijinzao
 * @date 2018/3/16 16:16
 **/
public class StatelessAuthcFilter extends AccessControlFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        UserVO user = new UserVO();
        user.setUserName("admin");
        StatelessToken token = new StatelessToken();
        token.setUsername(user.getUserName());
        try {
            getSubject(servletRequest, servletResponse).login(token);
        } catch (Exception e) {
            e.printStackTrace();
            onLoginFail(servletResponse); //6、登录失败
            return false;
        }
        return true;
    }


    //登录失败时默认返回401状态码
    private void onLoginFail(ServletResponse response) throws IOException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        httpResponse.getWriter().write("login error");
    }
}
