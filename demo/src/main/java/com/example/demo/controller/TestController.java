package com.example.demo.controller;

import com.example.demo.bean.TestbeanFromtesttable;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/abc")
@Slf4j
public class TestController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @GetMapping("fangwen")
    String helloWorld(){
        return "helloworld";
    }
    @GetMapping("selectAll")
    List jdbcconnect(){
//        List list = jdbcTemplate.queryForList("select * from testtable");
//        ApplicationContext context;
//        context.getBean("");
        List list = jdbcTemplate.query("select * from testtable",(rs,count)->{
            TestbeanFromtesttable e = new TestbeanFromtesttable();
            e.setID(rs.getInt("ID"));
            e.setName(rs.getString("name"));
            e.setAge(rs.getInt("age"));
            return e;
        }
        );
        return list;
    }
    @GetMapping("select1")
    TestbeanFromtesttable abc(){
        SqlSession openSqlSession= sqlSessionFactory.openSession();
        TestbeanFromtesttable t1=openSqlSession.selectOne("com.example.demo.Mapper.selectOneTest","a");
        openSqlSession.close();
        return t1;
    }
}