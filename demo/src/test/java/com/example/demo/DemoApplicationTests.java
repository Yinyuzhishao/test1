package com.example.demo;

import com.example.demo.bean.TestbeanFromtesttable;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.daotest.testInterface;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Time;
import java.util.List;
import java.util.Timer;

@SpringBootTest
class DemoApplicationTests {

//    String resource = "../../mappers/Mapper.xml";
//    InputStream inputStream = Resources.getResourceAsStream(resource);
//    @Test
//            void aa(){
//        System.out.println(inputStream);
//    }
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @Autowired
    public testInterface anInterface;

    DemoApplicationTests() throws IOException {
    }

    TestbeanFromtesttable abc(){
        SqlSession openSqlSession= sqlSessionFactory.openSession();
//        Timer timer=new Timer();    将报错“在timer内找不到‘id’”
        TestbeanFromtesttable t1=openSqlSession.selectOne("com.example.demo.daotest.testInterface.selectOneTest",2);
        openSqlSession.close();
        return t1;
    }

    @Test
    void noXmlTest(){
        System.out.println(anInterface.selectOneTest(3));
    }


    @Test
    void contextLoads() {

        try {
//            System.out.println(sqlSessionFactory);
            TestbeanFromtesttable t2=abc();
            System.out.println(t2);
        }
        catch (Throwable throwable ) {
            System.out.println(throwable);
        }

    }
    @Test
    void TestInterface(){
        SqlSession openSqlSession= sqlSessionFactory.openSession();
        testInterface testinterface=openSqlSession.getMapper(testInterface.class);
        TestbeanFromtesttable t4=testinterface.selectOneTest(2);
        System.out.println(t4);

    }
}