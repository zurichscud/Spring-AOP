package com.demo1.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: zurichscud
 * @Date: 2023/9/23 15:52
 * @Description: AOP注解建议类
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com..service.UserService.method*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before1() {
        System.out.println("切面编程");
    }


}
