package com.demo1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

/**
 * @Author: zurichscud
 * @Date: 2023/9/23 15:52
 * @Description: AOP注解建议类
 */
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com..service.UserService.method6(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("方法开始！");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("方法结束！");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Signature signature = point.getSignature();
        System.out.println("*************************");
        System.out.println(signature.getName());//获取方法名
        System.out.println(signature.getDeclaringType());//获取类声明
        System.out.println("*************************");
        System.out.println("开始计时");
        Object proceed = point.proceed();
        System.out.println("结束计时");
        return proceed;
    }


}
