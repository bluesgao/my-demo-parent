package com.gx.demo.ssm.web.service.impl;

import com.gx.demo.ssm.web.dao.UserDao;
import com.gx.demo.ssm.web.domain.User;
import com.gx.demo.ssm.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2011-2017 {company}
 * FileName: com.gx.demo.ssm.web.service.impl.UserServiceImpl.java
 * Author: gaoxin
 * Email: gaoxin11@jd.com
 * Date: 2017/12/8 17:55
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * {xxx}   17:55    1.0          Create
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selUserInfoById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
