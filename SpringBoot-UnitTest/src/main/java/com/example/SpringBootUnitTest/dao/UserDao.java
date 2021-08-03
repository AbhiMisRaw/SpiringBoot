package com.example.SpringBootUnitTest.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUser() {
        return "Tom";
    }
}
