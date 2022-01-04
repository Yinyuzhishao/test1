package com.example.demo.bean;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class TestbeanFromtesttable {
    int ID;
    String name;
    int age;
}
