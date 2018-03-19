package com.myproject.manager.impl;

import com.myproject.common.dao.impl.BaseMyBatisDaoImpl;
import com.myproject.manager.UserManager;
import com.myproject.model.vo.UserVO;
import org.springframework.stereotype.Service;

/**
 * @author lijinzao
 * @date 2018/3/16 16:39
 **/
@Service
public class UserManagerImpl extends BaseMyBatisDaoImpl implements UserManager {

    public UserVO findUser() {
        UserVO o = queryObjectByParams("user.findUser", null);
        return o;
    }
}
