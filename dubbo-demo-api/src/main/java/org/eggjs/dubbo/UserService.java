package org.eggjs.dubbo;

/**
 * 用户服务
 */
public interface UserService {
    /**
     * 打招呼
     * @param name
     * @return
     */
    String sayHello(String name);

    /**
     * 返回 user
     * @param user
     * @return
     */
    User echoUser(User user);
}
