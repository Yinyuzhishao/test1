package com.example.demo.daotest;

import com.example.demo.bean.TestbeanFromtesttable;
import org.springframework.stereotype.Repository;

@Repository
public interface testInterface {
    public TestbeanFromtesttable selectOneTest (int id);
}
