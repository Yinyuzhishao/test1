package com.atguigu.spring5.testdemo;


import com.atguigu.spring5.aop.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testbean2 {
    @Test
    public void testaop() {
        ApplicationContext context= new ClassPathXmlApplicationContext("bean3.xml");
        User user=context.getBean("user", User.class);
        user.add();

    }
}
