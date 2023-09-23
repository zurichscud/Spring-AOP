package com.demo1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: zurichscud
 * @Date: 2023/9/23 19:14
 * @Description: 面向Service的AOP
 */
@Component
@Aspect
public class ServiceAdvice {

    @Pointcut("execution(* com..service.UserService.method6(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint point) {
        Object[] args = point.getArgs();
        String arg = (String) args[0];
        if (arg.startsWith("张"))
            System.out.println("我讨厌姓张的人");
    }

    @After("pointCut()")
    public void after(JoinPoint point) {
        Object[] args = point.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @Around("pointCut()")
    public String around(ProceedingJoinPoint point) throws Throwable {
        String name = (String) point.proceed();
        if (name.startsWith("张"))
            return "再见";
        return name;
    }

}
