package com.example.demo2.main;


import com.example.demo2.bean.UserTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
import java.util.List;

@RestController
public class Hhtml {
    @Autowired
    SqlSessionFactory sqlSessionFactory;
   // @RequestMapping("table")

    @GetMapping("selectall")
        List<UserTest> allusers() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<UserTest> userTest = sqlSession.selectList("selectall");
        sqlSession.close();
        return userTest;
    }


    @GetMapping("selectone")
    UserTest contextLoads() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserTest userTest = sqlSession.selectOne("usertest",1);
        System.out.println(userTest);
        sqlSession.close();
        return userTest;
    }

}
