package com.gx.demo.ssm.web.service;

import com.gx.demo.ssm.web.dao.UserDao;
import com.gx.demo.ssm.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2011-2017 {company}
 * FileName: com.gx.demo.ssm.web.service.UserService.java
 * Author: gaoxin
 * Email: gaoxin11@jd.com
 * Date: 2017/12/7 17:15
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * {xxx}   17:15    1.0          Create
 */

public interface UserService {

    public User selUserInfoById(Integer id);
}
