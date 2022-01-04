package com.example.demo2.dao;


import com.example.demo2.bean.UserTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserTestDAO {
    public UserTest usertest(Integer id);

    public List<UserTest> selectall();
}
