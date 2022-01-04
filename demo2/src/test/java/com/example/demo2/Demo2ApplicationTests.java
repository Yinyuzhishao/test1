package com.example.demo2;

import com.example.demo2.bean.UserTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo2ApplicationTests {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    List<UserTest> allusers() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<UserTest> userTest = sqlSession.selectList("selectall");
        sqlSession.close();
        return userTest;
    }
    @Test
    void contextLoads() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserTest userTest = sqlSession.selectOne("selectOneTest",1);
        System.out.println(userTest);
    }


}
