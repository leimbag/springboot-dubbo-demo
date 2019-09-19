package com.leimbag.dubbo.demo.xml.web.controller;

import com.leimbag.dubbo.demo.api.bean.user.User;
import com.leimbag.dubbo.demo.api.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leimbag
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/hello")
    public String hello(String name) {
        return userService.sayHello(name);
    }

    // http://localhost:8080/user/create?name=%E5%93%88%E5%96%BD7&password=abc
    @RequestMapping(value = "/create")
    public String create(User user){
        return userService.create(user);
    }
}
