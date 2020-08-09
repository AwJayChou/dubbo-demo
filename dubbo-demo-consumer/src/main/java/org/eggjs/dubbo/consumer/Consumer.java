package org.eggjs.dubbo.consumer;

import com.alibaba.fastjson.JSON;
import org.eggjs.dubbo.User;
import org.eggjs.dubbo.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    /**
     * To get ipv6 address to work, add
     * System.setProperty("java.net.preferIPv6Addresses", "true");
     * before running your application.
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        UserService userService = (UserService) context.getBean("userService"); // get remote service proxy
        while (true) {
            try {
                Thread.sleep(1000);
                User user = new User();
                user.setName("宗羽");
                user.setSalary(10000);
                user.setId(68955);
                user.setAddress("蚂蚁C空间");
                User result = userService.echoUser(user); // call remote method
                System.out.println(JSON.toJSONString(result)); // get result
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
