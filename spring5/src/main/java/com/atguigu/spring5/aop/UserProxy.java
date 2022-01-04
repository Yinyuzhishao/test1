package com.atguigu.spring5.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

@Before("execution(* com.atguigu.spring5.aop.User.add(..))")

    public void before(){
        System.out.println("增强之before");
    }
}
