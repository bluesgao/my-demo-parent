import com.alibaba.fastjson.JSON;
import com.gx.demo.ssm.web.domain.User;
import com.gx.demo.ssm.web.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Copyright (C), 2011-2017 {company}
 * FileName: PACKAGE_NAME.UserTest.java
 * Author: gaoxin
 * Email: gaoxin11@jd.com
 * Date: 2017/12/7 18:23
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * {xxx}   18:23    1.0          Create
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-config.xml")
public class UserTest {
    @Autowired
    private UserService userService;
    private static final Logger LOG = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void test1() {
        User user = userService.selUserInfoById(4);
        LOG.info("-------" + JSON.toJSON(user));
    }

}
