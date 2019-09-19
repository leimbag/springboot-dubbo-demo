package com.leimbag.dubbo.demo.api.service.impl.user;

import com.leimbag.dubbo.demo.api.bean.user.User;
import com.leimbag.dubbo.demo.api.service.user.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author leiming
 */
@Service(version = "${dubbo.version}")
public class UserServiceImpl implements UserService {

    protected final transient Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String sayHello(String name) {
        logger.info("param name:{}", name);
        return "hello " + name;
    }

    @Override
    public String create(User user) {
        logger.info("create user, name={}, password={}" , user.getName(), user.getPassword());
        return "success";
    }
}
