package org.eggjs.dubbo.provider;

import org.eggjs.dubbo.User;
import org.eggjs.dubbo.UserService;

public class UserServiceImpl implements UserService {
    public String sayHello(String name) {
        return "hello " + name;
    }

    public User echoUser(User user) {
        return user;
    }
}
