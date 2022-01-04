package com.atguigu.spring5.aop;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(){
        System.out.println("方法add执行");
    }
}
