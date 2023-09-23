package com.demo1.service;

import com.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public void function() {
        System.out.println(mapper.getAllUser());
    }

    @Override
    public void method1() {
        Long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("method1程序运行中");
        }
        Long end=System.currentTimeMillis();
        System.out.println("花费时间："+(end-start));
    }

    @Override
    public void method2() {
        System.out.println("method2程序运行中");//核心业务
    }

    @Override
    public void method3() {
        System.out.println("method3程序运行中");//核心业务
    }
}
