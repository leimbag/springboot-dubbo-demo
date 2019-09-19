package com.leimbag.dubbo.demo.api.bean.user;

import java.io.Serializable;

/**
 * @author leimbag
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6076519705735463889L;

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
