package com.leimbag.dubbo.demo.api.service.user;

import com.leimbag.dubbo.demo.api.bean.user.User;

/**
 * @author leimbag
 */
public interface UserService {
    String sayHello(String name);

    String create(User user);
}
