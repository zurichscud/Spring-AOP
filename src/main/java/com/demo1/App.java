package com.demo1;

import com.demo1.config.SpringConfig;
import com.demo1.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用Spring启动MyBatis
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ac.getBean(UserService.class);
//        userService.method2();
        //使用AOP编程，让method2实现与method1相同的效果
//        userService.method3();
//        userService.method11();
        userService.method4("lai");
        userService.method5("lai","bing");
        userService.method11();


    }
}
